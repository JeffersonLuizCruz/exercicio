package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 21. Implemente um método que receba
 * 	   uma lista de strings e retorne um elemento especifíco.
 * */
public class Lista21 {

	// Busca binária
	public static String searchBinary(List<String> list, String name){
		Collections.sort(list);
		int binarySearch = Collections.binarySearch(list, name);
		if(binarySearch >= 0) {
			return name;
		}else {
			return "Não encontrado";
		}
	}
	
	// Busca por filtro
	public static String searchFilter(List<String> list, String name) {
		return list.stream().filter(str -> str.equals(name)).findFirst().orElse("Não encontrado");
	}
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira");
		
		System.out.println(searchBinary(listStr,"Hugo"));
		System.out.println(searchFilter(listStr, "Hugo"));
	}
}
