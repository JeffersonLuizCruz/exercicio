package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class List06 {

	/**
	 * 6. Implemente uma função que retorne o índice da primeira 
	 * ocorrência de um elemento em uma lista.
	 * */
	
	// Tradicional
	public static Integer fastIndex(List<String> list, String element) {
		
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).equals(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// Lambda
	public static <T> int findFirstIndexOfElement(List<T> list, T element) {
		return IntStream.range(0, list.size())
		.filter(i -> list.get(i).equals(element))
		.findFirst().orElse(-1);

	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Hugo", "Oliveira", "Jeff");
		System.out.println(fastIndex(listStr, "Caroul"));
		System.out.println(findFirstIndexOfElement(listStr, "Carol"));
	}
}
