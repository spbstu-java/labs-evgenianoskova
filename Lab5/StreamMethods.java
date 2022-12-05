package Lab5;

import java.util.*;
import java.util.stream.Collectors;

public class StreamMethods {
    public static double method1(List<Integer> list){
        return list.stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics()
                .getAverage();
    }

    public static List<String> method2(List<String> list){
        return list.stream()
                .map(String::toUpperCase)
                .map(s -> "_new_" + s)
                .toList();
    }

    public static List<Integer> method3(List<Integer> list){
        return list.stream()
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> 1L == entry.getValue())
                .map(Map.Entry::getKey)
                .map(x -> x *x)
                .toList();
    }

    public static List<String> method4(Collection<String> list, String startElement){
        return list.stream()
                .filter(x -> x.startsWith(startElement))
                .sorted(String.CASE_INSENSITIVE_ORDER)
                .toList();
    }

    public static <T> T method5(Collection <T> collection){
        return collection.stream()
                .reduce((x, y) -> y)
                .orElseThrow(() -> new NoSuchElementException("The collection is empty"));
    }

    public static int method6(int[] array){
        return Arrays.stream(array)
                .filter(x -> x % 2 == 0)
                .reduce(0, Integer::sum);
    }

    public static Map<Character, String > method7(List<String> list){
        return list.stream()
                .collect(Collectors.toMap(s -> s.charAt(0), s -> s.substring(1)));
    }
}
