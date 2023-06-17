package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista15 {

	/**
	 * 15. Implemente um método que retorne o número de ocorrências de um 
	 * elemento em uma lista.
	 * */
	
	public static <T> Long numOcorrenciaStr(List<String> list,String element) {
		return list.stream()
		.filter(obj -> obj.equals(element))
		.count();
	}
	
	public static Long numOcorrenciaInt(List<Integer> list,Integer element) {
		return list.stream()
		.filter(obj -> obj.equals(element))
		.count();

	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
		List<String> listStr = Arrays.asList("Hugo","Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira");
		
		System.out.println(numOcorrenciaStr(listStr, "Hugo"));
		System.out.println(numOcorrenciaInt(numberInteger, 5));
	}
}
