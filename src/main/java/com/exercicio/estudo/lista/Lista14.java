package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Lista14 {

	/**
	 * 14. Escreva uma função que concatene duas listas em uma única lista.
	 * */
	
	public static List<Integer> concatInteger(List<Integer> listA, List<Integer> listB){
		return Stream.concat(listA.stream(), listB.stream()).toList();
	}
	
	public static void main(String[] args) {
		List<Integer> numA = Arrays.asList(1, 2, 3, 4, 5);
		List<Integer> numB = Arrays.asList(6, 7, 8, 9, 10);
		
		System.out.println(concatInteger(numA, numB));
	}
}
