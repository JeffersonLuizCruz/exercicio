package com.exercicio.estudo.polimorfismo.exemplo01;

public class Gato extends Animal{

	public void emitirSomGato() {
		System.out.println("Som: miau Miau");
	}

	@Override
	protected void tipoAnimal() {
		System.out.println("Tipo: Felino");
	}
}
