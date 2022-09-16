package br.com.ane.predicateexample;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Predicate {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Nane1", "Nane2", "Nane3");

        List<String> collect = list.stream()
                .filter(x -> x.startsWith("Nane"))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
