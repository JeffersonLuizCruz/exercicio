package com.exercicio.estudo.estruturadedados.vetor;

import lombok.Data;

@Data
public class Vetor {
	private String[] elementos;
	private int tamanho;
	
	public Vetor(int tamanho) {
		this.elementos = new String[tamanho];
	}
	
	public void adiciona(String elemento) {
		for (int i = 0; i < this.elementos.length; i++) {
			if (elementos[i] == null) {
				this.elementos[i] = elemento;
				break;
			}
		}
	}
	
	public boolean adicionaAprimorado(String elemento) {
//		if(this.tamanho < this.elementos.length) {
//			this.elementos[this.tamanho] = elemento;
//			this.tamanho ++;
//		}
		this.elementos[this.tamanho] = elemento;
		this.tamanho ++;
		return false;
	}
}
