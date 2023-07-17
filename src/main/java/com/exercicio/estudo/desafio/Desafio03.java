package com.exercicio.estudo.desafio;

import java.util.Scanner;

public class Desafio03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // Ler o tamanho do array
        int k = scanner.nextInt(); // Ler o valor alvo

        int[] arr = new int[n]; // Criar o array

        // Ler os elementos do array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int count = 0; // Variável para contar o número de pares

        // Loop para percorrer todos os pares possíveis de elementos
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Verificar se a diferença entre os elementos é igual a k
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        System.out.println(count); // Imprimir a quantidade de pares encontrados
    }
}
