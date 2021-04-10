package com.prottonne.streams;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Barclay", "Barry", "Bert", "Bot", "Bart");
        names.stream() // or .parallelStream()
                .filter(name -> name.contains("t"))                         // Predicate
                .filter(name -> name.contains("a") || name.contains("e"))  // Predicate
                .forEach(name -> System.out.println(name));                 // Consumer
    }
}
