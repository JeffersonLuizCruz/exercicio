package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista16 {

	/**
	 * 16. Crie uma função que receba uma lista de números 
	 * inteiros e retorne uma nova lista com os elementos em ordem inversa.
	 * */
	
	// Tradicional
	public static List<Integer> inverter(List<Integer> list){
		Collections.reverse(list);
		return list;
	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
		
		System.out.println(inverter(numberInteger));
	}
}
