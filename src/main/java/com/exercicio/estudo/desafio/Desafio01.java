package com.exercicio.estudo.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Desafio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int N = scanner.nextInt(); // Ler o número de linhas de entrada
		List<Integer> pares = new ArrayList<>();
		List<Integer> impares = new ArrayList<>();

		// Ler os valores e armazenar na lista apropriada (par ou ímpar)
		for (int i = 0; i < N; i++) {
			int valor = scanner.nextInt();
			if (valor % 2 == 0) {
				pares.add(valor);
			} else {
				impares.add(valor);
			}
		}

		// Ordenar a lista de números pares em ordem crescente
		Collections.sort(pares);

		// Ordenar a lista de números ímpares em ordem decrescente
		Collections.sort(impares, Comparator.reverseOrder());

		// Imprimir os números pares
		for (int par : pares) {
			System.out.println(par);
		}

		// Imprimir os números ímpares
		for (int impar : impares) {
			System.out.println(impar);
		}
	}
}
