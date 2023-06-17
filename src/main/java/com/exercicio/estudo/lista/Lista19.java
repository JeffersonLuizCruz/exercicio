package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.List;

public class Lista19 {

	/**
	 * 19. Crie um método que receba uma lista de números inteiros e retorne a média dos elementos.
	 * */
	
	// Tradicional
	public static Double average(List<Integer> list) {
		Double average = 0.0;
		for(Integer num : list) {
			average += num; 
		}
		return (average / list.size());
	}
	
	// Lambda
	public static Double media(List<Integer> list) {
		double orElseGet = list.stream().mapToInt(Integer::intValue).average().orElseGet(() -> 0);
		return Double.valueOf(orElseGet);
	}
	
	// Lambda
	public static Double media_v2(List<Integer> list) {
		double orElseGet = list.stream().mapToInt(Integer::intValue).sum();
		return (Double.valueOf(orElseGet) / list.size());
	}
	
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 3, 4, 5,6);
		
		System.out.println(media(numberInteger));
		System.out.println(media_v2(numberInteger));
		System.out.println(average(numberInteger));
	}
}
