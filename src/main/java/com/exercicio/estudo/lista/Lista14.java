package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lista14 {

	/**
	 * 14. Escreva uma função que concatene duas listas de número inteiro em uma
	 * única lista.
	 */
	
	// Exemplo: V1
	public static List<Integer> concatListV1(List<Integer> listA, List<Integer> listB){
		return Stream.concat(listA.stream(), listB.stream()).toList();
	}
	
	// Exemplo: V2
	public static List<Integer> concatListV2(List<Integer> listA, List<Integer> listB){
		List<Integer> newList = new ArrayList<>(listA);
		newList.addAll(listB);
		
		return newList;
	}
	
	public static void main(String[] args) {
		List<Integer> numA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> numB = Arrays.asList(6, 7, 8, 9, 10);
		
		System.out.println(concatListV1(numA, numB));
		System.out.println(concatListV2(numA, numB));
	}
}
