package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap03 {

	// Acesse o valor associado a uma chave específica.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key-01", "Jefferson");
		
		System.out.println("Resultado do valor da key: " + map.get("key-01"));
	}
}
