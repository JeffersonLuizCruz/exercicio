package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista13 {

	/**
	 * 13. Crie um método que receba uma lista de objetos e retorne uma nova lista apenas 
	 * com os objetos que são instâncias de uma determinada classe.
	 * @param <T>
	 * */
	
	// Lambda
	public static <T> List <T> filtrarObjetosPorClasseLambda(List<Object> list, Class<T> classe){
		return list.stream()
				.filter(obj -> classe.isInstance(obj))
				.map(obj -> classe.cast(obj))
				.collect(Collectors.toList());
	}

	
	// Tradicional
	public static <T> List <T> filtrarObjetosPorClasse(List<Object> list, Class<T> classe){
		List<T> objGeneric = new ArrayList<>();
		for(Object obj : list) {
			if(classe.isInstance(obj)) {
				objGeneric.add(classe.cast(obj));
			}
		}
		return objGeneric;
	}
	
	public static void main(String[] args) {
		List<Object> asList = Arrays.asList("Hugo", "Jeff", "Luiz", 1, 2, 3);
		System.out.println(filtrarObjetosPorClasse(asList, Integer.class));
		System.out.println(filtrarObjetosPorClasseLambda(asList, String.class));
	}
}
