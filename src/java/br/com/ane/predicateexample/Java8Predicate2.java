package br.com.ane.predicateexample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Java8Predicate2 {

    public static void main(String[] args) {
        Predicate<String> startWithA = x -> x.startsWith("A");

        List<String> list = Arrays.asList("Ane", "Greici", "Greiciane");

        List<String> collect = list.stream()
                .filter(startWithA.negate())
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
