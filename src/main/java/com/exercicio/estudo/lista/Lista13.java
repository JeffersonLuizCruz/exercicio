package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lista13 {

	/**
	 * 13. Crie um método que receba uma lista de objetos e retorne uma nova lista
	 * apenas com os objetos que são instâncias de uma determinada classe.
	 */
	
	// Exemplo: V1
	public static <T> List <T> filterObjectsByClassV1(List<Object> list, Class<T> classe){
		List<T> collect = list.stream()
				.filter(obj -> classe.isInstance(obj))
				.map(obj -> classe.cast(obj))
				.collect(Collectors.toList());
		
		List<T> newObjects = new ArrayList<>(collect);
		return newObjects;
	}

	// Exemplo: V2
	public static <T> List <T> filterObjectsByClassV2(List<Object> list, Class<T> classe){
		List<T> newObjects = new ArrayList<>();
		for(Object obj : list) {
			if(classe.isInstance(obj)) {
				newObjects.add(classe.cast(obj));
			}
		}
		return newObjects;
	}
	
	public static void main(String[] args) {
		List<Object> objts = Arrays.asList("Hugo", "Jeff", "Luiz", 1, 2, 3);
		
		System.out.println(filterObjectsByClassV1(objts, Integer.class));
		System.out.println(filterObjectsByClassV2(objts, String.class));
	}
}
