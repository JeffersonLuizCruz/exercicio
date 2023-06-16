package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista07 {

	/**
	 * 7. Crie um método que receba uma lista de números inteiros e retorne 
	 * uma nova lista com todos os elementos elevados ao quadrado.
	 * */
	
	// Tradicional
	public static List<Integer> numInt(List<Integer> list){
		List<Integer> listQuadrado = new ArrayList<>();
		Integer quadrado = null;
		for(Integer num : list) {
			quadrado = num * num;
			listQuadrado.add(quadrado);
		}
		return listQuadrado;
	}
	
	// Lambda
	public static List<Integer> numIntLambda(List<Integer> list){
		return list.stream()
				.mapToInt(num -> num * num)
				.boxed() // Converte IntStream para Stream<Integer>
				.collect(Collectors.toList());
	}
	
	public static List<Integer> squareListElements(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> number * number)
                .collect(Collectors.toList());
    }
	
	public static void main(String[] args) {
		List<Integer> listNum = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(numInt(listNum));
		System.out.println(squareListElements(listNum));
	}
}
