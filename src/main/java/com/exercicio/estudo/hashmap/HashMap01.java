package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap01 {

	/*
	 * Crie um HashMap vazio.
	 */
	
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		boolean vazio = map.isEmpty() ? true : false;
		System.out.println("Valor é vazio? " + vazio);
	}
}
