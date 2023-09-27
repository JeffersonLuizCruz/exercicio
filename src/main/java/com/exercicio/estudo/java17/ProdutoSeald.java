package com.exercicio.estudo.java17;

public sealed class ProdutoSeald permits Telefone, Computador, TipoProduto{
	void acessorio() {
		System.out.println("Acessório default");
	}
	
}
