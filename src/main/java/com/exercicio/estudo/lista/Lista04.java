package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
	
	// Exemplo: V4
	public static int findMaxV4(List<Integer> numbers) {
		Optional<Integer> max = numbers.stream().collect(Collectors.maxBy(Comparator.naturalOrder()));
		return max.orElse(-1);
	}
	
	// Exemplo: V5
	public static IntSummaryStatistics findMaxV5(List<Integer> numbers) {
		IntSummaryStatistics max = numbers.stream().collect(Collectors.summarizingInt(Integer::intValue));
		return max;
	}
	
	public static int findMaxV6(List<Integer> numbers) {
		return Collections.max(numbers);
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 300, 4, 5, 90, 10, 7);
		Integer v1 = findMaxV1(numbers);
		Integer v2 = findMaxV2(numbers);
		Integer v3 = findMaxV3(numbers);
		Integer v4 = findMaxV4(numbers);
		IntSummaryStatistics v5 = findMaxV5(numbers);
		int v6 = findMaxV6(numbers);
		
		System.out.println("Exemplo V1 - Maior elemento: " + v1);
		System.out.println("Exemplo V2 - Maior elemento: " + v2);
		System.out.println("Exemplo V3 - Maior elemento: " + v3);
		System.out.println("Exemplo V4 - Maior elemento: " + v4);
		System.out.println("Exemplo V5 - Maior elemento: " + v5.getMax());
		System.out.println("Exemplo V6 - Maior elemento: " + v6);
	}
}
