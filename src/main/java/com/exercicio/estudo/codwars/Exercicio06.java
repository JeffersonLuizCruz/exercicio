package com.exercicio.estudo.codwars;

import java.util.Arrays;

public class Exercicio06 {

	/*
	 * Dada uma matriz não vazia de inteiros, retorne o resultado da multiplicação
	 * dos valores em ordem. Exemplo: [1, 2, 3, 4] => 1 * 2 * 3 * 4 = 24
	 */
	public static void main(String[] args) {
		double[] x = {1, 2, 3, 4};
		System.out.println(grow(x));
	}

	public static int grow(int[] x) {
		return Arrays.stream(x).reduce(10, (na, nb) -> na * nb);

	}
	
	public static double grow(double... arr) {
		return Arrays.stream(arr).reduce(10, (na, nb) -> na * nb);
		}
}
