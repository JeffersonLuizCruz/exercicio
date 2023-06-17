package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista17 {

	/**
	 * 17. Escreva um método que receba uma lista de strings e retorne a 
	 * lista com todas as strings convertidas para letras maiúsculas.
	 * */
	
	//Lambda
	public static List<String> upCaseStr(List<String> list){
		return list.stream().map(String::toUpperCase).toList();
	}
	
	// Tradicional
	
	public static List<String> upCaseStrTr(List<String> list){
		List<String> newStr = new ArrayList<>();
		for(String str: list) {
			newStr.add(str.toUpperCase());
		}
		
		return newStr;
	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira", "Ana");
		System.out.println(upCaseStr(listStr));
		System.out.println(upCaseStrTr(listStr));
	}
}
