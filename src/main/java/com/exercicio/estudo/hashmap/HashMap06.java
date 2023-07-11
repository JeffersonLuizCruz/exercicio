package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap06 {

	// Verifique se o HashMap está vazio.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key-01", "Jefferson");
		map.put("key-02", "Hugo");
		map.put("key-03", "Luiz");
		
		boolean isEmpty = map.isEmpty() ? true : false;
		
		System.out.println("Existe elementos? " + isEmpty);
	}
}
