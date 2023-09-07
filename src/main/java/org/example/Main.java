package org.example;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 2, 6, 5, 1, 4, 7, 3, 0);
        numbers.stream()
                .filter(number -> number % 2 == 1)
                .sorted()
                .map(number -> number * 2)
                .forEach(System.out::println);
    }
}