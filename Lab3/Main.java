package Lab3;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args){

        File dictionaryFile = new File("./resources/dictionary.txt");
        File forTranslation = new File("./resources/forTranslation.txt");

        Translator translator = new Translator();

        try {
            translator.loadDictionary(dictionaryFile);
            translator.translate(forTranslation);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
