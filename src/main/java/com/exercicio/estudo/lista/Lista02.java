package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista02 {

/**
 * Escreva uma função que inverta a ordem dos elementos em uma lista.
 * */
	
	public static List<String> invert(List<String> list) {
		Collections.reverse(list);
		Collections.sort(list);
		return list;
		}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira");
		
		System.out.println(invert(listStr));
	}
}
