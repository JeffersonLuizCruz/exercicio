package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista09 {

	/**
	 * Implemente um método que remova todos os elementos ímpares 
	 * de uma lista de números inteiros.
	 * */
	
	// Lambda
	public static List<Integer> removerImpar(List<Integer> list) {
		return list.stream().filter(n1 -> (n1 % 2) == 0)
		.collect(Collectors.toList());
	}
	
	// Tradicional
	public static List<Integer> removerImparTra(List<Integer> list){
		List<Integer> par = new ArrayList<>();
		for(Integer num : list) {
			if((num % 2) == 0) {
				par.add(num);
			}
		}
		return par;
	}
	
	public static void main(String[] args) {
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5);
        System.out.println(removerImpar(numbers1));
        System.out.println(removerImparTra(numbers1));
	}
}
