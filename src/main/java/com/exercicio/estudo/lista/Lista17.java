package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista17 {

	/**
	 * 17. Escreva um método que receba uma lista de strings e retorne a lista com
	 * todas as strings convertidas para letras maiúsculas.
	 */
	
	// Exemplo: V1
	public static List<String> transformToUpperCaseV1(List<String> list){
		return list.stream().map(String::toUpperCase).toList();
	}
	
	// Exemplo: V2
	public static List<String> transformToUpperCaseV2(List<String> list){
		List<String> newStr = new ArrayList<>();
		for(String str: list) {
			newStr.add(str.toUpperCase());
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		
		System.out.println(transformToUpperCaseV1(strings));
		System.out.println(transformToUpperCaseV2(strings));
	}
}
