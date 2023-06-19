package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lista04 {
	/**
	 * 4. Crie uma função que encontre o maior elemento em uma lista de números
	 * inteiros.
	 */
	
	// Exemplo: V1
	public static Integer findMaxV1(List<Integer> numbers) {
		int max = Integer.MIN_VALUE;
		for(Integer num : numbers) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	// Exemplo: V2
	public static Integer findMaxV2(List<Integer> numbers) {
		Optional<Integer> max = numbers.stream()
				.reduce((na, nb) -> na > nb ? na : nb);
		return max.get();
	}
	
	// Exemplo: V3
	public static Integer findMaxV3(List<Integer> numbers) {
		Optional<Integer> max = numbers.stream()
				.reduce((na, nb) -> Math.max(na, nb));
		return max.get();
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 300, 4, 5, 90, 10, 7);
		Integer findMaxTrad = findMaxV1(numbers);
		Integer findMaxLamb = findMaxV2(numbers);
		Integer findMaxLambMath = findMaxV3(numbers);
		
		System.out.println("Exemplo V1 - Maior elemento: " + findMaxTrad);
		System.out.println("Exemplo V2 - Maior elemento: " + findMaxLamb);
		System.out.println("Exemplo V3 - Maior elemento: " + findMaxLambMath);
	}
}
