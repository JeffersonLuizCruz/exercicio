package com.exercicio.estudo.estruturadedados.vetor;

public class VetorTest {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(5);
		vetor.adicionaAprimorado("A");
		vetor.adicionaAprimorado("B");
		vetor.adicionaAprimorado("C");
		
		vetor.adicionaAprimorado(3, "D");
		
		System.out.println(vetor.lista());
		
	}
}
