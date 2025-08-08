package com.exercicio.estudo.array;

public class Execute {

    public static void main(String[] args) {
        int[] numero = new int[5];

        Integer[] vetor = {10, 20, 30, 40, 50};

        for(int i = 0; i < vetor.length; i++){
            System.out.println(vetor[i]);
        }

        System.out.println("---------------------");

        for(int number : vetor) {
            System.out.println(number);
        }
    }
}
