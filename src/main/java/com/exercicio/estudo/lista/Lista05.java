package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lista05 {

	/**
	 * 5. Escreva um método que remova todos os elementos duplicados de uma lista.
	 */
	
	
	// Exemplo: V1
	public static List<String> removeDuplicateElementV1(List<String> elements) {
		Set<String> unique = new HashSet<>();
		for (String str : elements) {
			unique.add(str);
		}
		return unique.stream().toList();
	}
	
	// Exemplo: V2
	public static List<String> removeDuplicateElementV2(List<String> elements) {
		List<String> unique = new ArrayList<>();
		for (String str : elements) {
			if (!unique.contains(str)) {
				unique.add(str);
			}
		}
		return unique.stream().toList();
	}
	
	// Exemplo: V3
	public static List<String> removeDuplicateElementV3(List<String> elements) {
		return elements.stream().distinct().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("Fulano", "Fulano", "Beltrano", "Maria", "Fulano", "José");
		
		List<String> uniqueElementV1 = removeDuplicateElementV1(elements);
		List<String> uniqueElementV2 = removeDuplicateElementV2(elements);
		List<String> uniqueElementV3 = removeDuplicateElementV3(elements);
		
		System.out.println("Modo Tradicional V1: " + uniqueElementV1);
		System.out.println("Modo Tradicional V2: " + uniqueElementV2);
		System.out.println("Usando Lambda: " + uniqueElementV3);
	}
}
