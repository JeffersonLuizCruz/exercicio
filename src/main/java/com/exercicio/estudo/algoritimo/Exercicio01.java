package com.exercicio.estudo.algoritimo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercicio01 {

    /**
     * Você tem uma lista com vários objetos. Ao percorrer essa lista via laço for acontece
     * uma exception. Então você precisa criar um algoritimo que faça que essa lista continue
     * percorrer toda a lista de onde aconteceu a interrupção.
     */
    public static List<String> strings = new ArrayList<>();

    public static List<String> lists() {
        strings.add("Hugo");
        strings.add("Jeff");
        strings.add("Jefferson");
        strings.add("Luiz");
        strings.add(null);
        strings.add("Carol");
        strings.add("Oliveira");
        strings.add("Ana");
        strings.add("Carolina");
        strings.add("Cruz");

        return strings;
    }

    public static void main(String[] args) {
        lists();
        List<String> myList = new ArrayList<>();
        AtomicInteger countAtomic = new AtomicInteger();


        for (int i = 0; i < strings.size(); i++) {
            try {
                System.out.println(strings.get(i).toUpperCase());
            } catch (NullPointerException e) {
                throw new NullPointerException("Error");
            }
        }
        System.out.println("----------------------------------");
        try {
            strings.stream().forEach(obj -> {
                countAtomic.getAndIncrement();
                System.out.println(obj.toUpperCase());
            });
        } catch (NullPointerException ex) {
            strings.subList(countAtomic.get(), strings.size()).forEach(System.out::println);
        }

    }

}
