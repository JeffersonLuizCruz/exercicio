package com.exercicio.estudo.polimorfismo.exemplo01;

public class Cachorro extends Animal{

	public void emitirSomCachorro() {
		System.out.println("Som: Uau Uau!");
	}

	@Override
	protected void tipoAnimal() {
		System.out.println("Tipo: Cachorro");
	}
}
