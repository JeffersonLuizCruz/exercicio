package com.exercicio.estudo.estruturadedados.api;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	
	/*
	 * Realize um CRUD básico usando a estrutura de dados: FILA
	 * Em uma fila, a substituição direta de um elemento não é uma operação fornecida diretamente
	 * pela estrutura de dados. Isso ocorre porque uma fila segue o princípio FIFO
	 * (First-In-First-Out), onde o primeiro elemento inserido é o primeiro a ser removido.
	 */
	
	public static void main(String[] args) {
		Queue<String> strings = new LinkedList<>();
		strings.offer("Fulano");
		strings.offer("Ciclano");
		strings.offer("Beltrano");
		strings.offer("João");
		strings.offer("Maria");
		strings.offer("José");
		
		// C - Adiciona um elemento na fila
		strings.offer("Juvenal");
		System.out.println(strings);
		
		// R - Ler um elemento na fila
		System.out.println(strings.poll());
		System.out.println(strings.poll());
		System.out.println(strings.poll());
		System.out.println(strings);
		
		System.out.println("-----------------");
		
		// R - Ler um elemento na fila
		System.out.println(strings.peek());
		System.out.println(strings);
	}
}
