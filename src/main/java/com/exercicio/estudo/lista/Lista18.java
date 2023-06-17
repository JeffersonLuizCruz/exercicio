package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista18 {

	/**
	 * 18. Implemente uma função que embaralhe aleatoriamente os elementos em uma lista.
	 * */
	
	public static List<String> randon(List<String> list){
		Collections.shuffle(list);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira", "Ana");
		System.out.println(randon(listStr));
	}
}
