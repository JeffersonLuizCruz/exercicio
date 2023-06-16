package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista11 {

	/**
	 * 11. Escreva um método que receba duas listas de 
	 * números inteiros e retorne uma nova lista contendo os elementos comuns 
	 * às duas listas.
	 * */
	
	// Lambda
	public static List<String> listMatch(List<String> listA, List<String> listB){
		return listA.stream()
		.filter(a -> listB.contains(a))
		.collect(Collectors.toList());
	}
	
	public static List<String> listMatchTrad(List<String> listA, List<String> listB){
		List<String> str = new ArrayList<>();
		for(String a : listA) {
			if(listB.contains(a)){
				str.add(a);
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		List<String> listA = Arrays.asList("Jefferson", "Carol", "Oliveira", "Ana");
		List<String> listB = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson",  "Ana");

		System.out.println(listMatch(listA, listB));
		System.out.println(listMatchTrad(listA, listB));
	}
}
