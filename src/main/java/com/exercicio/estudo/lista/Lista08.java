package com.exercicio.estudo.lista;

import java.util.List;
import java.util.stream.IntStream;

public class Lista08 {

	/**
	 * 8. Escreva uma função que verifique se uma lista está ordenada em ordem
	 * crescente.
	 */
	
	public static boolean isListOrdered(List<Integer> list) {
		return IntStream.range(0, list.size() -1)
				.allMatch(i -> (list.get(i) <= list.get(i +1)));
	}
	
	public static void main(String[] args) {
        List<Integer> numbers2 = List.of(1, 3, 2, 4, 5);
        
        System.out.println(isListOrdered(numbers2));
        
	}
}
