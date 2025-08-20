package com.exercicio.estudo.array;

import java.util.Arrays;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Execute {

    public static void main(String[] args) {

        int [] vetor = {1, 2, 3, 4};

        int[] revert = new int[vetor.length];

        for(int i = 0; i < vetor.length; i++) {
            revert[i] = vetor[vetor.length -1 -i];
        }

        Arrays.stream(revert).forEach(System.out::print);
    }
}