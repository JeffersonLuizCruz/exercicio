package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista16 {

	/**
	 * 16. Crie uma função que receba uma lista de números inteiros e retorne uma
	 * nova lista com os elementos em ordem inversa.
	 */
	
	// Exemplo: V1
	public static List<Integer> inverter(List<Integer> numbers){
		List<Integer> newList = new ArrayList<>(numbers);
		Collections.reverse(newList);
		return newList;
	}
	
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
		
		System.out.println(inverter(numbers));
	}
}
