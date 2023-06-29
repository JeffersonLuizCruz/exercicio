package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lista11 {

	/**
	 * 11. Escreva um método que receba duas listas de strings inteiros e retorne
	 * uma nova lista contendo os elementos comuns às duas listas.
	 */
	
	// Exemplo: V1
	public static List<String> listMatchV1(List<String> listA, List<String> listB){
		List<String> matchStrings = listA.stream()
		.filter(a -> listB.contains(a))
		.collect(Collectors.toList());
		
		List<String> newlist = new ArrayList<>(matchStrings);
		return newlist;
	}
	
	// Exemplo: V2
	public static List<String> listMatchV2(List<String> listA, List<String> listB){
		List<String> strings = new ArrayList<>();
		for(String a : listA) {
			if(listB.contains(a)){
				strings.add(a);
			}
		}
		return strings;
	}
	
	// Exemplo: V3
	public static List<String> listMatchV3(List<String> listA, List<String> listB){
		List<String> matchStrings = listA.stream()
		.filter(a -> listB.contains(a))
		.collect(Collectors.toList());
		
		List<String> newlist = new ArrayList<>(matchStrings);
		return newlist;
	}
	
	// Exemplo: V4
	public static List<String> listMatchV4(List<String> listA, List<String> listB){
		Stream<String> filter = Stream.concat(listA.stream(), listB.stream())
				.filter(a -> listB.contains(a)).distinct();
		return filter.toList();
	}
	
	public static void main(String[] args) {
		List<String> listA = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		List<String> listB = Arrays.asList("Fulano", "Beltrano", "João");

		System.out.println(listMatchV1(listA, listB));
		System.out.println(listMatchV2(listA, listB));
		System.out.println(listMatchV3(listA, listB));
		System.out.println(listMatchV4(listA, listB));
		
	}
}
