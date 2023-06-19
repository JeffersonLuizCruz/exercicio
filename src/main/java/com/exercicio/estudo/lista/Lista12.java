package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista12 {

	/**
	 * 12. Implemente uma função que receba uma lista de strings e retorne a
	 * quantidade de strings que começam com a letra "A".
	 */
	
	// Exemplo: V1
	public static Integer totalStrV1(List<String> strings) {
		Integer count = 0;
		for(String str : strings) {
			if(str.toUpperCase().startsWith("A".toUpperCase())) {
				count++;
			}
		}
		return count;
	}
	
	// Exemplo: V2
	public static long totalStrV2(List<String> strings) {
		return strings.stream().filter(str -> str.toUpperCase().startsWith("A".toUpperCase())).count();
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		
		System.out.println(totalStrV1(strings));
		System.out.println(totalStrV2(strings));
	}
}
