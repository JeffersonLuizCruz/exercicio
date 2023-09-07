package com.exercicio.estudo.codwars;

import java.util.Arrays;

public class Exercicio04 {
	/*
	 * Dado um array de inteiros, retorne um novo array 
	 * com cada valor duplicado.
	 * 
	 * Por exemplo:
	 * 
	 * [1, 2, 3] --> [2, 4, 6]
	 */
	public static void main(String[] args) {
		
	}
	  public static int[] map(int... arr) {
		  return Arrays.stream(arr).map(n -> n * 2).toArray();
	  }
}
