package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista10 {

	/**
	 * 10. Crie uma função que retorne uma lista contendo apenas os números pares de
	 * uma lista original.
	 */
	
	// Exemplo: V1
	public static List<Integer> findEvenV1(List<Integer> list) {
		return list.stream().filter(n1 -> (n1 % 2) == 0)
		.collect(Collectors.toList());
	}
	
	// Exemplo: V2
	public static List<Integer> findEvenV2(List<Integer> list){
		List<Integer> even = new ArrayList<>();
		for(Integer num : list) {
			if((num % 2) == 0) {
				even.add(num);
			}
		}
		return even;
	}
	
	public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);
        System.out.println(findEvenV1(numbers));
        System.out.println(findEvenV2(numbers));
	}
}
