package com.exercicio.estudo.estruturadedados.api;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	// Realize um CRUD básico usando a estrutura de dados: LISTA
	
	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();
		strings.add("Fulano");
		strings.add("Ciclano");
		strings.add("Beltrano");
		strings.add("José");
		strings.add("Maria");
		strings.add("João");
		
		// C - Adicionar elemento em uma lista
		strings.add(1, "Juvenal");
		System.out.println(strings);
		
		// R - Ler elemento de uma lista especifíca
		String element = strings.get(0);
		System.out.println(element);
		
		// U - Faz update de um elemento de uma lista
		strings.set(0, "Joaquim");
		System.out.println(strings);
		
		// D - Delete de um elemento de uma lista
		strings.remove(0);
		System.out.println(strings);
	}
}
