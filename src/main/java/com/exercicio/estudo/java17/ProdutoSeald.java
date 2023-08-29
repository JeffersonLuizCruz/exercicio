package com.exercicio.estudo.java17;

public sealed class ProdutoSeald permits Telefone, Computador{

	void acessorio() {
		System.out.println("Acesso");
	}
}
