package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lista04 {
	/**
	 * 4. Crie uma função que encontre o maior elemento em uma lista de números
	 * inteiros.
	 */
	
	// Tradicional
	public static Integer findMaxTrad(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		for(Integer num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	// Lambda
	public static Integer findMaxLamb(List<Integer> numbers) {
		Optional<Integer> max = numbers.stream()
				.reduce((na, nb) -> na > nb ? na : nb);
		return max.get();
	}
	
	// Lambda Math
	public static Integer findMaxLambMath(List<Integer> numbers) {
		Optional<Integer> max = numbers.stream()
				.reduce((na, nb) -> Math.max(na, nb));
		return max.get();
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 300, 4, 5, 90, 10, 7);
		Integer findMaxTrad = findMaxTrad(numbers);
		Integer findMaxLamb = findMaxLamb(numbers);
		Integer findMaxLambMath = findMaxLambMath(numbers);
		
		System.out.println("Tradicional - Maior elemento: " + findMaxTrad);
		System.out.println("Lambda - Maior elemento: " + findMaxLamb);
		System.out.println("Lambda Math - Maior elemento: " + findMaxLambMath);
	}
}
