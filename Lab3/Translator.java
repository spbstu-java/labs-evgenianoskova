package Lab3;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Translator {

    public Map<String, String> map = new HashMap<>();

    public void loadDictionary(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        for (String line = br.readLine(); line != null; line = br.readLine()){
            String[] parsedLine = line.split("\\|");
            String expression = parsedLine[0];
            String meaning = parsedLine[1];
            map.put(expression, meaning);
        }
        br.close();
        System.out.println(map);
    }

    public void translate(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        for (String line = br.readLine(); line != null; line = br.readLine()) {
            String[] words  = line.split("[^\\p{L}\\p{N}]+");

            for (int i = 0; i < words.length; i++) {
                String translation = null;
                List<String> variants = new ArrayList<>();
                int count = 0;
                for (String j : map.keySet()) {
                    if (j.toLowerCase().contains(words[i].toLowerCase())) {
                        if (j.equalsIgnoreCase(words[i])) {
                            variants.add(words[i]);
                        }
                        int next = i + 1;
                        String nextWord = words[i];
                        String newWord = null;
                        while (next < words.length && j.toLowerCase().contains(words[next].toLowerCase())) {
                            nextWord += " " + words[next];
                            ++next;
                            newWord = nextWord;
                        }
                        if (j.equalsIgnoreCase(newWord)) {
                            variants.add(newWord);
                        }
                    }
                }
                if(!variants.isEmpty()){
                    int maxString = variants.get(0).length();
                    int index = 0;
                    for (String variant : variants) {
                        if (variant.length() > maxString) {
                            maxString = variant.length();
                            index = i;
                        }
                    }
                    translation = map.get(variants.get(index));
                    String[] cnt = variants.get(index).split(" ");
                    count = cnt.length-1;
                }
                i += count;
                if (translation == null) {
                    System.out.print(words[i] + " ");
                } else {
                    System.out.print(translation + " ");
                }
            }
        }
        br.close();
    }
}
