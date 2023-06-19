package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista18 {

	/**
	 * 18. Implemente uma função que embaralhe aleatoriamente os elementos em uma
	 * lista.
	 */
	
	public static List<String> randon(List<String> strings){
		List<String> newList = new ArrayList<>(strings);
		Collections.shuffle(newList);
		return newList;
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		System.out.println(randon(strings));
	}
}
