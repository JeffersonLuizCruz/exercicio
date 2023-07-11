package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap05 {

	// Remova um par chave-valor do HashMap.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key-01", "Jefferson");
		map.put("key-02", "Hugo");
		map.put("key-03", "Luiz");
		
		map.remove("key-02");
		
		System.out.println(map);
	}
}
