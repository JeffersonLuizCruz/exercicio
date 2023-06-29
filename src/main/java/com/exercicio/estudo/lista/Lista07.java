package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista07 {

	/**
	 * 7. Crie um método que receba uma lista de números inteiros e retorne uma nova
	 * lista com todos os elementos elevados ao quadrado.
	 */
	
	// Exemplo: V1
	public static List<Integer> squareListElementsV1(List<Integer> list){
		List<Integer> squareList = new ArrayList<>();
		Integer square = null;
		for(Integer num : list) {
			square = num * num;
			squareList.add(square);
		}
		return squareList;
	}
	
	// Exemplo: V2
	public static List<Integer> squareListElementsV2(List<Integer> list){
		return list.stream()
				.mapToInt(num -> num * num)
				.boxed() // Converte IntStream para Stream<Integer>
				.collect(Collectors.toList());
	}
	
	// Exemplo: V3
	public static List<Integer> squareListElementsV3(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(squareListElementsV1(numbers));
		System.out.println(squareListElementsV2(numbers));
	}
}
