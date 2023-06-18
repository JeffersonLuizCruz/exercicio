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
	
	
	// Tradicional - 
	public static List<String> removeDuplicateElementTrad(List<String> elements) {
		Set<String> unique = new HashSet<>();
		for (String str : elements) {
			unique.add(str);
		}
		return unique.stream().toList();
	}
	
	// Tradicional
	public static List<String> removeDuplicateElementTra(List<String> elements) {
		List<String> unique = new ArrayList<>();
		for (String str : elements) {
			if (!unique.contains(str)) {
				unique.add(str);
			}
		}
		return unique.stream().toList();
	}
	
	// Lambda
	public static List<String> removeDuplicateElementLamb(List<String> elements) {
		return elements.stream().distinct().collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		List<String> elements = Arrays.asList("Fulano", "Fulano", "Beltrano", "Maria", "Fulano", "José");
		
		List<String> uniqueElementTrad = removeDuplicateElementTrad(elements);
		List<String> uniqueElementTra = removeDuplicateElementTra(elements);
		List<String> uniqueElementLamb = removeDuplicateElementLamb(elements);
		
		System.out.println("Modo Tradicional V1: " + uniqueElementTrad);
		System.out.println("Modo Tradicional V2: " + uniqueElementTra);
		System.out.println("Usando Lambda: " + uniqueElementLamb);
	}
}
