package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista12 {

	/**
	 * 12. Implemente uma função que receba uma lista de strings e retorne a
	 * quantidade de strings que começam com a letra "A".
	 */
	
	// Exemplo: V1
	public static Integer countStr(List<String> list) {
		Integer count = 1;
		for(String str : list) {
			if(str.startsWith("a")) {
				count++;
			}
		}
		return count;
	}
	
	// Exemplo: V2
	public static long countStrLambda(List<String> list) {
		return list.stream().filter(str -> str.toUpperCase().startsWith("A")).count();
	}
	
	public static void main(String[] args) {
		List<String> listA = Arrays.asList("aJefferson", "Carol", "Oliveira", "Ana");
		
		System.out.println(countStr(listA));
		System.out.println(countStrLambda(listA));
	}
}
