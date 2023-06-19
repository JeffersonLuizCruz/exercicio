package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista02 {

	/**
	 * 02. Escreva uma função que inverta a ordem e ordene os elementos string em uma lista.
	 */
	
	// Não reinvente a roda. Use a classe utilitária Collections.
	public static List<String> reverseAndSort(List<String> strings) {
		// O uso da Collections modifica a lista original durante o processo de ordenação. Por isso
		// é necessário criar uma nova lista.
		List<String> newlist = new ArrayList<>(strings);
		Collections.reverse(newlist); 
		Collections.sort(newlist); 
		return newlist;
		}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		List<String> listReverseAndSort = reverseAndSort(strings);
		
		System.out.println("Elementos originais: " + strings);
		System.out.println("Elementos invertidos e ordenados: " + listReverseAndSort);
	}
}
