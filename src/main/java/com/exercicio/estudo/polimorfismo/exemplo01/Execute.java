package com.exercicio.estudo.polimorfismo.exemplo01;

public class Execute {

	public static void main(String[] args) {
		Animal cachorro = new Cachorro();
		// Ex: V1 - Herança e Polimorfismo
		cachorro.fazSom(); // Uso de herança
		cachorro.tipoAnimal(); // Uso do polimorfismo
		
		// Ex: V2 - Herança e sem Polimorfismo
		Cachorro cachorroInstance = new Cachorro();
		cachorroInstance.fazSom(); // Uso de herança
		cachorroInstance.emitirSomCachorro(); // Método de instância de objeto. Sem Herença e Polimorfismo
		cachorroInstance.tipoAnimal();// Método de instância de objeto. Sem Herença e Polimorfismo
		
		System.out.println("----------------------------");
		
		Animal gato = new Gato();
		// Ex: V1 - Herança e Polimorfismo
		gato.fazSom(); // Uso de herança
		gato.tipoAnimal(); // Uso do polimorfismo

		// Ex: V2 - Herança e sem Polimorfismo
		Gato gatoInstance = new Gato();
		gatoInstance.fazSom(); // Uso de herança
		gatoInstance.emitirSomGato(); // Método de instância de objeto. Sem Herença e Polimorfismo
		gatoInstance.tipoAnimal();// Método de instância de objeto. Sem Herença e Polimorfismo

	}
}
