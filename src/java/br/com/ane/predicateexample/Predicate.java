package br.com.ane.predicateexample;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
