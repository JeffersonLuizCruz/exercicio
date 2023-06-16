package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lista05 {

	/**
	 * 5. Escreva um método que remova todos os elementos duplicados de uma lista.
	 * */
	
	// Lambda
	public static List<String> removeDuplicate(List<String> list) {
		return list.stream()
				.distinct()
				.collect(Collectors.toList());
	}
	
	// Tradicional
	public static List<String> removeDuplicateTrad(List<String> list){
		Set<String> unique = new HashSet<>();
		for(String str : list) {
			unique.add(str);
		}
		return unique.stream().toList();
	}
	
	// Usando If
	public static List<String> removeDuplicateWithIf(List<String> list){
		List<String> unique = new ArrayList<>();
		for(String str : list) {
			if(!unique.contains(str)) {
				unique.add(str);
			}
		}
		return unique.stream().toList();
	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Hugo", "Oliveira", "Jeff");
		System.out.println(removeDuplicate(listStr));
		System.out.println(removeDuplicateTrad(listStr));
		System.out.println(removeDuplicateWithIf(listStr));
	}
}
