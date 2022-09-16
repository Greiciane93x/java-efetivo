package br.com.ane.bipredicate;

import java.util.function.BiPredicate;

public class JavaBiPredicate1 {

    public static void main(String[] args) {
        BiPredicate<String, Integer> filter = (x, y) -> x.length() == y;

        boolean result = filter.test("nane", 4);
        System.out.println(result);

        boolean result2 = filter.test("nane", 5);
        System.out.println(result2);

    }
}
