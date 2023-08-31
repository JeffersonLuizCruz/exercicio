package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista20 {

	/**
	 * 20. Escreva uma função que verifique se uma lista contém apenas números
	 * ímpares.
	 */
	
	/**
	 * 21. Escreva uma função que verifique se uma lista contém algum número
	 * ímpar.
	 */
	
	// Exercício 20: V1
	public static boolean isOddNumber(List<Integer> list) {
		return list.stream().allMatch(n1 -> (n1 % 2) != 0 ? true : false);
	}
	
	// Exercício 21: V1
	public static boolean isOddNumberAny(List<Integer> list) {
		return list.stream().anyMatch(n1 -> (n1 % 2) != 0 ? true : false);
	}
	
	public static void main(String[] args) {
		List<Integer> numbersImpares = Arrays.asList(1, 3, 3, 5, 11,13);
		List<Integer> numbersPares = Arrays.asList(2, 4, 7, 0, 10,12);
		
		System.out.println(isOddNumber(numbersImpares));
		System.out.println(isOddNumberAny(numbersPares));
	}
}
