package com.exercicio.estudo.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMap04 {

	// Verifique se uma chave específica está presente no HashMap.
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("key-01", "Jefferson");
		map.put("key-02", "Hugo");
		map.put("key-03", "Luiz");
		
		boolean isKey = map.containsKey("key-02");
		
		System.out.println("Contem uma chave? " + isKey);
	}
}
