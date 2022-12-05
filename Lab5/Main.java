package Lab5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------First method---------------");
        List<Integer> list1 = List.of(1, 2, 3, 4, 5);
        System.out.println(StreamMethods.method1(list1));
        System.out.println();

        System.out.println("------------Second method---------------");
        List<String> list2 = List.of("one", "two", "three");
        System.out.println(StreamMethods.method2(list2));
        System.out.println();

        System.out.println("------------Third method---------------");
        List<Integer> list3 = List.of(1, 2, 2, 3, 4, 4);
        System.out.println(StreamMethods.method3(list3));
        System.out.println();

        System.out.println("------------Fourth method---------------");
        List<String> list4 = List.of("one", "two", "tree", "four", "five");
        System.out.println(StreamMethods.method4(list4, "f"));
        System.out.println();

        System.out.println("------------Fifth method---------------");
        List<Double> list5 = List.of(1.1, 1.2, 1.3);
        List<Integer> arrayList5 = new ArrayList<>();
        try {
            System.out.println(StreamMethods.method5(list5));
            System.out.println(StreamMethods.method5(arrayList5));
        }catch (NoSuchElementException e){
            System.out.println(e.getMessage());
        }
        System.out.println();

        System.out.println("------------Sixth method---------------");
        int[] array61 = {1, 2, 3, 4, 5};
        int[] array62 = {1, 3, 5};
        System.out.println(StreamMethods.method6(array61));
        System.out.println(StreamMethods.method6(array62));
        System.out.println();

        System.out.println("------------Seventh method---------------");
        List<String> list7 = List.of("one", "tree", "four");
        System.out.println(StreamMethods.method7(list7));
        System.out.println();
    }
}
