package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista03 {

	/**
	 * 3. Implemente um método que receba uma lista de strings e retorne uma nova
	 * lista com todas as strings em ordem alfabética.
	 */
	
	// Não reinvente a roda. Use a classe utilitária Collections.
	public static List<String> sort(List<String> strings){
		Collections.sort(strings);
		return strings;
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		List<String> newSortedString = sort(strings);
		
		System.out.println("Lista original: " + strings);
		System.out.println("Nova lista modificada: " + newSortedString);
	}
}
