package com.exercicio.estudo.java17;

public final class Telefone extends ProdutoSeald {
	
	@Override
	public void acessorio() {
		super.acessorio();
		System.out.println("Acessorio para Telefone");
	}
}
