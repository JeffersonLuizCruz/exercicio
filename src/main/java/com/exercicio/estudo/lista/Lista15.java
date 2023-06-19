package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista15 {

	/**
	 * 15. Implemente um método que retorne o número de ocorrências de um elemento
	 * em uma lista.
	 */
	
	// Exemplo: V1
	public static Long totalElementV1(List<String> list,String element) {
		return list.stream()
		.filter(obj -> obj.equals(element))
		.count();
	}
	
	// Exemplo: V2
	public static Long totalElementV2(List<Integer> list,Integer element) {
		return list.stream()
		.filter(obj -> obj.equals(element))
		.count();
	}
	
	public static void main(String[] args) {
		List<String> listA = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
		
		System.out.println(totalElementV1(listA, "Hugo"));
		System.out.println(totalElementV2(numbers, 5));
	}
}
