package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Lista06 {

	/**
	 * 6. Implemente uma função que retorne o índice da primeira ocorrência de um
	 * elemento string em uma lista.
	 */
	
	// Exemplo: V1
	public static Integer fastIndexV1(List<String> strings, String element) {
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).equalsIgnoreCase(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// Exemplo: V2
	public static int findIndexV2(List<String> strings, String element) {
		List<String> listLowerCase = strings.stream().map(String::toLowerCase).toList();
		return listLowerCase.indexOf(element.toLowerCase());
	}
	
	// Exemplo: V3
	public static int findIndexV3(List<String> strings, String element) {
		return IntStream.range(0, strings.size())
		.filter(i -> strings.get(i).equalsIgnoreCase(element))
		.findFirst().orElse(-1);
	}
	
	// Exemplo: V4
	public static int findIndexV4(List<String> strings, String element) {
		Optional<Integer> map = strings.stream()
				.filter(n -> n.equalsIgnoreCase(element))
				.findFirst()
				.map(strings::indexOf);
		return map.orElse(-1);
	}
			
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");

		String elementoA = "fulano";
		Integer indexV1 = fastIndexV1(strings, elementoA);
		
		String elementoB = "beltrano";
		int indexV2 = findIndexV2(strings, elementoB);
		
		String elementoC = "ciclano";
		int indexV3 = findIndexV3(strings, elementoC);
		
		String elementoD = "Fulano";
		long indexV4 = findIndexV4(strings, elementoD);
		
		System.out.println("indexV1 - Index do elemento '" + elementoA + "' na posição: " + indexV1);
		System.out.println("indexV2 - Index do elemento '" + elementoB + "' na posição: " + indexV2);
		System.out.println("indexV3 - Index do elemento '" + elementoC + "' na posição: " + indexV3);
		System.out.println("indexV4 - Index do elemento '" + elementoD + "' na posição: " + indexV4);
	}
	

}
