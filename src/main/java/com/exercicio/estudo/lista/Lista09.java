package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista09 {

	/**
	 * Implemente um método que remova todos os elementos ímpares de uma lista de
	 * números inteiros.
	 */
	
	// Exemplo: V1
	public static List<Integer> removeOddNumbersV1(List<Integer> numbers) {
		return numbers.stream().filter(n1 -> (n1 % 2) == 0)
		.collect(Collectors.toList());
	}
	
	// Exemplo: V2
	public static List<Integer> removeOddNumbersV2(List<Integer> numbers){
		List<Integer> even = new ArrayList<>();
		for(Integer num : numbers) {
			if((num % 2) == 0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(removeOddNumbersV1(numbers));
        System.out.println(removeOddNumbersV2(numbers));
	}
}
