package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class Lista21 {
	/**
	 * 21. Implemente um método que receba uma lista de strings e retorne um
	 * elemento especifíco.
	 */
	
	
	// Exemplo: V1
	public static String searchV1(List<String> strings, String name) {
		List<String> newStrings = new ArrayList<>(strings);
		List<String> list = newStrings.stream().map(String::toLowerCase).collect(Collectors.toList());
		Collections.sort(list);
		int binarySearch = Collections.binarySearch(list, name.toLowerCase());
		
		if (binarySearch >= 0) {
			return name;
		} else {
			return "Not Found";
		}
	}

	// Exemplo: V2
	public static String searchV2(List<String> strings, String name) {
		return strings.stream().filter(str -> str.equalsIgnoreCase(name)).findFirst().orElse("Not Found");
	}

	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");

		System.out.println(searchV1(strings, "josé"));
		System.out.println(searchV2(strings, "ciclano"));
	}
}
