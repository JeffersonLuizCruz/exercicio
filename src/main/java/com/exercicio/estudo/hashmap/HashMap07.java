package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap07 {
	// Obtenha o número total de pares chave-valor no HashMap.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key-01", "Jefferson");
		map.put("key-02", "Hugo");
		map.put("key-03", "Luiz");
		
		System.out.println("Total de elementos: " + map.size());
	}
}
