package com.exercicio.estudo.lista;

import java.util.ArrayList;
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
		// O uso da Collections modifica a lista original durante o processo de ordenação. Por isso
		// é necessário criar uma nova lista.
		List<String> newListStrs = new ArrayList<>(strings);
		Collections.sort(newListStrs);
		return newListStrs;
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		List<String> newSortedString = sort(strings);
		
		System.out.println("Lista original: " + strings);
		System.out.println("Nova lista modificada: " + newSortedString);
	}
}
