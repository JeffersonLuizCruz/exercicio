package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista01 {
	/**
	 * 1. Crie um método que receba uma lista de números inteiros e retorne a soma
	 * de todos os elementos.
	 */
	
	// Tradicional
	public static Integer calculateSumTra(List<Integer> numbers) {
		Integer sum = 0;
		for(Integer number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	// Método de Referência
	public static int calculateSumMR(List<Integer> numbers) {
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}
	
	// Lambda
	public static int calculateSumLamb(List<Integer> numbers) {
		return numbers.stream().mapToInt(num -> num).sum();
	}
		
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);	
        int sumTra = calculateSumTra(numbers);
        int sumMR = calculateSumMR(numbers);
        int sumLamb = calculateSumLamb(numbers);
        
        System.out.println("Tradicional - A soma dos números é: " + sumTra);
        System.out.println("Método de Referência - A soma dos números é: " + sumMR);
        System.out.println("Lambda - A soma dos números é: " + sumLamb);
	}
}
