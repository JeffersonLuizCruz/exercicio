package com.exercicio.estudo.algoritimo;

import java.util.ArrayList;
import java.util.List;

public class Exercicio01 {

    /**
     * Você tem uma lista com vários objetos. Ao percorrer essa lista via laço for acontece
     * uma exception. Então você precisa criar um algoritimo que faça que essa lista continue
     * percorrer toda a lista de onde aconteceu a interrupção.
     */

    public static List<String>lists(){
        List<String> strings = new ArrayList<>();
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
        int count = 0;
        for (int i = 0; i < lists().size(); i++){
            try {
                count++;
                System.out.println(lists().get(i).toUpperCase());
            } catch (Exception e) {
                lists().subList(i, count + 1).forEach(System.out::println);
            }
        }
    }
}
