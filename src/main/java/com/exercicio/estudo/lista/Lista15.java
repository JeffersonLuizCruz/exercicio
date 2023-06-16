package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lista15 {

	/**
	 * 15. Implemente um método que retorne o número de ocorrências de um 
	 * elemento em uma lista.
	 * */
	
	public static <T> Long numOcorrencia(List<String> list,String element,  Class<T> classe) {
		List<T> totalOccorencia = new ArrayList<>();
		
		for(Object obj : list) {
			if(classe.isInstance(obj)) {
				totalOccorencia.add(classe.cast(obj));
			}
		}
		return totalOccorencia.stream()
		.filter(obj -> obj.equals(element))
		.count();

	}
	
	public static <T> Long numOcorrencia(List<Integer> list,Integer element,  Class<T> classe) {
		List<T> totalOccorencia = new ArrayList<>();
		
		for(Object obj : list) {
			if(classe.isInstance(obj)) {
				totalOccorencia.add(classe.cast(obj));
			}
		}
		return totalOccorencia.stream()
		.filter(obj -> obj.equals(element))
		.count();

	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 3, 4, 5, 5, 5);
		List<String> listStr = Arrays.asList("Hugo","Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira");
		
		System.out.println(numOcorrencia(listStr, "Hugo", String.class));
		System.out.println(numOcorrencia(numberInteger, 5, Integer.class));
	}
}
