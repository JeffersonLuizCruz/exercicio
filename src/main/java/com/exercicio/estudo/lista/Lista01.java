package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class Lista01 {
	
	/**
	 * 1. Crie um método que receba uma lista de números inteiros e retorne a soma
	 * de todos os elementos.
	 */
	
	// Exemplo: V1
	public static Integer calculateSumV1(List<Integer> numbers) {
		Integer sum = 0;
		for(Integer number : numbers) {
			sum += number;
		}
		return sum;
	}
	
	// Exemplo: V2
	public static int calculateSumV2(List<Integer> numbers) {
		return numbers.stream().mapToInt(Integer::intValue).sum();
	}
	
	// Exemplo: V3
	public static int calculateSumV3(List<Integer> numbers) {
		return numbers.stream().mapToInt(num -> num).sum();
	}
	
	// Exemplo: V4
	public static IntSummaryStatistics calculateSumV4(List<Integer> numbers) {
		return numbers.stream().collect(Collectors.summarizingInt(e -> e));
	}
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);	
        int sumV1 = calculateSumV1(numbers);
        int sumV2 = calculateSumV2(numbers);
        int sumV3 = calculateSumV3(numbers);
        IntSummaryStatistics sumV4 = calculateSumV4(numbers);
        
        System.out.println("Tradicional - A soma dos números é: " + sumV1);
        System.out.println("Método de Referência - A soma dos números é: " + sumV2);
        System.out.println("Lambda - A soma dos números é: " + sumV3);
        System.out.println("Lambda - A soma dos números é: " + sumV4.getSum());
	}
}
