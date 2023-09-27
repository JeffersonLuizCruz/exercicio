package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Lista19 {

	/**
	 * 19. Crie um método que receba uma lista de números inteiros e retorne a média
	 * dos elementos.
	 */
	
	// Exemplo: V1
	public static Double averageV1(List<Integer> numbers) {
		Double sum = 0.0;
		for(Integer num : numbers) {
			sum += num; 
		}
		return (sum / numbers.size());
	}
	
	// Exemplo: V2
	public static Double averageV2(List<Integer> numbers) {
		double average = numbers.stream().mapToInt(Integer::intValue).average().orElse(0);
		return Double.valueOf(average);
	}
	
	// Exemplo: V3
	public static Double averageV3(List<Integer> numbers) {
		double sum = numbers.stream().mapToInt(Integer::intValue).sum();
		return (Double.valueOf(sum) / numbers.size());
	}
	
	// Exemplo: V4
	public static IntSummaryStatistics averageV4(List<Integer> numbers) {
		IntSummaryStatistics summury = numbers.stream().mapToInt(Integer::intValue).summaryStatistics();
		return summury;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5,6);
		
		System.out.println(averageV1(numbers));
		System.out.println(averageV2(numbers));
		System.out.println(averageV3(numbers));
	}
}
