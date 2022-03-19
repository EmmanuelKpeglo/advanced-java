package com.company.hackerrank;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class HackerrankTests {
    public static void main(String[] args) {

        List<String> letters = Arrays.asList("a", "B", "f", "D");
        letters.stream().forEach(letter -> System.out.println(letter.equals(letter.toUpperCase())));

    }
}
