package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista03 {

	/**
	 * 3. Implemente um método que receba uma lista de strings e retorne uma nova lista 
	 * 	  com todas as strings em ordem alfabética.
	 * */
	
	public static List<String> sortStr(List<String> list){
		Collections.sort(list);
		return list;
	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira", "Ana");
		
		System.out.println(sortStr(listStr));
	}
}
