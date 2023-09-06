package com.exercicio.estudo.codwars;

public class Exercicio03 {

	/*
	 * Este kata consiste em multiplicar um determinado número por oito se for par e
	 * por nove caso contrário.
	 */

	public static int simpleMultiplication(int n) {
		if((n % 2) == 0) return (n * 8);
		if((n % 2) != 0) return (n * 9);
		return -1;
	}
}
