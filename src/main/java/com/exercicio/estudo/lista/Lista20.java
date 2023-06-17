package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista20 {

	/**
	 * 20. Escreva uma função que verifique se uma lista contém apenas números primos.
	 * */
	
	// Lambda
	public static boolean allMatchPrimo(List<Integer> list) {
		return list.stream().allMatch(n1 -> (n1 % 2) != 0 ? true : false);
	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 3, 7, 5, 11,13);
		
		System.out.println(allMatchPrimo(numberInteger));
	}
}
