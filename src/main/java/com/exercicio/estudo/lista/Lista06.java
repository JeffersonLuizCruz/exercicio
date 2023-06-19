package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Lista06 {

	/**
	 * 6. Implemente uma função que retorne o índice da primeira ocorrência de um
	 * elemento string em uma lista.
	 */
	
	// Tradicional
	public static Integer fastIndexTrad(List<String> strings, String element) {
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).equalsIgnoreCase(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// Lambda
	public static int findIndexLambA(List<String> strings, String element) {
		List<String> listLowerCase = strings.stream().map(String::toLowerCase).toList();
		return listLowerCase.indexOf(element.toLowerCase());
	}
	
	// Lambda
	public static int findIndexLambB(List<String> strings, String element) {
		return IntStream.range(0, strings.size())
		.filter(i -> strings.get(i).equals(element))
		.findFirst().orElse(-1);
	}
			
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		
		String elementoA = "fulano";
		Integer indexTrd = fastIndexTrad(strings, elementoA);
		
		String elementoB = "beltrano";
		int findIndex = findIndexLambA(strings, elementoB);
		
		String elementoC = "Ciclano";
		int indexLamb = findIndexLambB(strings, elementoC);
		
		System.out.println("Modo Tradicional - Index do elemento '" + elementoA + "' na posição: " + indexTrd);
		System.out.println("Lambda - Index do elemento '" + elementoB + "' na posição: " + findIndex);
		System.out.println("Modo Tradicional - Index do elemento '" + elementoC + "' na posição: " + indexLamb);
	}
	

}
