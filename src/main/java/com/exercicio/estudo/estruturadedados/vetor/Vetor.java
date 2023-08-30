package com.exercicio.estudo.estruturadedados.vetor;

import lombok.Data;

@Data
public class Vetor {
	private String[] elementos;
	private int tamanho = 0;
	
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
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho ++;
		}
		return false;
	}
	
	public int tamanho() {
		if(this.tamanho >= 0) {
			return this.tamanho;
		}
		return -1;
	}
	
	public int buscarIndex(String elemento) {
		for(int i = 0; i < this.tamanho; i++) {
			if(this.elementos[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}
	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		return this.elementos[posicao];
	}
	
	// ToDo
	public boolean update(int posicao, String elemento) {
		if(!(posicao >= 0 && posicao < this.tamanho)) {
			throw new IllegalArgumentException("Posição inválida.");
		}
		
		for(int i = this.tamanho - 1; i >= posicao; i--) {
			this.elementos[i +1] = this.elementos[i];
		}
		this.elementos[posicao] = elemento;
		this.tamanho ++;
		return true;
	}
	
	public String lista() {
		String concatStr = "";
		for(int i = 0; i < this.elementos.length; i++) {
			concatStr += " " + this.elementos[i];
		}
		return concatStr.stripLeading();
	}
}
