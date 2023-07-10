package com.exercicio.estudo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Result {

    /*
     * Complete the 'subsetA' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public  List<Integer> subsetA(List<Integer> arr) {
        // Converte a lista em um array
        int[] array = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            array[i] = arr.get(i);
        }

        // Ordena o array em ordem decrescente
        Arrays.sort(array);
        reverseArray(array);

        int somaA = 0;
        int somaB = 0;
        List<Integer> subconjuntoA = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            // Adiciona o elemento atual em A e atualiza a soma
            subconjuntoA.add(array[i]);
            somaA += array[i];

            // Verifica se a soma de A é maior que a soma de B
            if (somaA > somaB) {
                // Verifica se a interseção entre A e B é null
                if (verificarIntersecaoNull(subconjuntoA, array, i + 1)) {
                    // Atualiza a soma de B
                    somaB = calcularSomaB(array, i + 1);
                } else {
                    // Remove o último elemento adicionado em A
                    subconjuntoA.remove(subconjuntoA.size() - 1);
                    somaA -= array[i];
                }
            } else {
                // Remove o último elemento adicionado em A
                subconjuntoA.remove(subconjuntoA.size() - 1);
                somaA -= array[i];
            }
        }

        return subconjuntoA;
    }

    private static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    private static boolean verificarIntersecaoNull(List<Integer> subconjuntoA, int[] array, int startIndex) {
        for (int i = startIndex; i < array.length; i++) {
            if (subconjuntoA.contains(array[i])) {
                return false;
            }
        }
        return true;
    }

    private static int calcularSomaB(int[] array, int startIndex) {
        int somaB = 0;
        for (int i = startIndex; i < array.length; i++) {
            somaB += array[i];
        }
        return somaB;
    }

    public  void main(String[] args) {
        List<Integer> arr = Arrays.asList(5, 3, 2, 8, 4, 1);
        List<Integer> subconjuntoA = subsetA(arr);

        if (subconjuntoA.isEmpty()) {
            System.out.println("Não foi possível encontrar um subconjunto A válido.");
        } else {
            System.out.println("Subconjunto A: " + subconjuntoA);
        }
    }
}

