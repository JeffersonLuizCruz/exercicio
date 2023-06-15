package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Lista04 {
/**
 * 4. Crie uma função que encontre o maior elemento em uma lista de números inteiros.
 * */
	
	// Tradicional
	public static Integer numIntTra(List<Integer> listNum) {
		int max = 0;
		
		for(Integer num : listNum) {
			if(num > max) {
				max = num;
			}
		}
		return max;
	}
	
	// Lambda
	public static Integer numIntLambda(List<Integer> listNum) {
		Optional<Integer> max = listNum.stream()
				.reduce((na, nb) -> na > nb ? na : nb);
		return max.get();
	}
	
	// Lambda Meth
	public static Integer numIntLambdaMath(List<Integer> listNum) {
		Optional<Integer> max = listNum.stream()
				.reduce((na, nb) -> Math.max(na, nb));
		return max.get();
	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 300, 4, 5, 90, 10, 7);
		
		System.out.println(numIntTra(numberInteger));
		System.out.println(numIntLambda(numberInteger));
		System.out.println(numIntLambdaMath(numberInteger));
	}
}
