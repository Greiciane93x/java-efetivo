package br.com.ane.predicateexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Predicate3 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ane","Ane1", "Ane2", "Ane3");

        System.out.println(StringProcessor
                .filter(list, x -> x.startsWith("A")));

        System.out.println(StringProcessor
                .filter(list, x -> x.startsWith("A") && x.length() == 3));

    }
}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate::test).collect(Collectors.toList());
    }
}

