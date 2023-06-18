package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class Lista06 {

	/**
	 * 6. Implemente uma função que retorne o índice da primeira ocorrência de um
	 * elemento string em uma lista.
	 */
	
	// Tradicional
	public static Integer fastIndexTrad(List<String> strings, String element) {
		for (int i = 0; i < strings.size(); i++) {
			if (strings.get(i).equalsIgnoreCase(element)) {
				return i;
			}
		}
		return -1;
	}
	
	// Lambda
	public static int findFirstIndexOfElementLamb(List<String> strings, String element) {
		return IntStream.range(0, strings.size())
		.filter(i -> strings.get(i).equals(element))
		.findFirst().orElse(-1);
	}
	
	// Lambda + generic
	public static <T> int findFirstIndexOfElement(List<T> strings, T element) {
		return IntStream.range(0, strings.size())
		.filter(i -> strings.get(i).equals(element))
		.findFirst().orElse(-1);

	}
	
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("Fulano", "Ciclano", "Beltrano", "Maria", "João", "José");
		
		String elementoA = "fulano";
		Integer indexTrd = fastIndexTrad(strings, elementoA);
		
		String elementoB = "Ciclano";
		int indexLamb = findFirstIndexOfElementLamb(strings, elementoB);
		
		String elementoC = "Beltrano";
		IndexUtil util = new IndexUtil();
		int fastIndexBinarySearch = util.fastIndexBinarySearch(strings, elementoC);
		
		System.out.println("Modo Tradicional - Index do elemento '" + elementoA + "' na posição: " + indexTrd);
		System.out.println("Busca com Binary Search - Index do elemento '" + elementoB + "' na posição: " + indexLamb);
		System.out.println("Modo Tradicional - Index do elemento '" + elementoC + "' na posição: " + fastIndexBinarySearch);
	}
	
	public static class IndexUtil{
		// Não reinvente a roda. Use a classe utilitária Collections.
		public  int fastIndexBinarySearch(List<String> strings, String element) {
	        try {
	            // Aguardar algum tempo entre as iterações, se necessário
	            Thread.sleep(1000);
	        } catch (InterruptedException e) {
	            // Lidar com a interrupção da thread
	            Thread.currentThread().interrupt();
	        }
			 Collections.sort(strings);
			return Collections.binarySearch(strings, element);
		}
	}
}
