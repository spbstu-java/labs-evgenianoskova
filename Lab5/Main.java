package Lab5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----------getAverageVal----------------");
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        System.out.println(StreamMethods.getAverageVal(list1));
        System.out.println();

        System.out.println("------------toUpCase---------------");
        List<String> list2 = List.of("one", "two", "three");
        System.out.println(StreamMethods.toUpCase(list2));
        System.out.println();

        System.out.println("-------------getUniqueToSqrt--------------");
        List<Integer> list3 = List.of(1, 2, 2, 3, 4, 4);
        System.out.println(StreamMethods.getUniqueToSqrt(list3));
        System.out.println();

        System.out.println("------------sortStrStartedWithLetter---------------");
        List<String> list4 = List.of("one", "two", "tree", "four", "five");
        System.out.println(StreamMethods.sortStrStartedWithLetter(list4, "f"));
        System.out.println();

        System.out.println("------------getLastElem---------------");
        List<Double> list5 = List.of(1.1, 1.2, 1.3);
        List<Integer> arrayList5 = new ArrayList<>();
        try {
            System.out.println(StreamMethods.getLastElem(list5));
            System.out.println(StreamMethods.getLastElem(arrayList5));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("------------getSumOfEvenNum---------------");
        int[] array61 = {1, 2, 3, 4, 5};
        int[] array62 = {1, 3, 5};
        System.out.println(StreamMethods.getSumOfEvenNum(array61));
        System.out.println(StreamMethods.getSumOfEvenNum(array62));
        System.out.println();

        System.out.println("-------------convertToMapq--------------");
        List<String> list7 = List.of("one", "tree", "four");
        System.out.println(StreamMethods.convertToMap(list7));
        System.out.println();
    }
}
