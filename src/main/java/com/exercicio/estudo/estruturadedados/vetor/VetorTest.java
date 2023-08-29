package com.exercicio.estudo.estruturadedados.vetor;

public class VetorTest {

	public static void main(String[] args) {
		Vetor vetor = new Vetor(2);
		vetor.adicionaAprimorado("Hugo");
		vetor.adicionaAprimorado("Jeff");
		
//		System.out.println(vetor.buscarIndex("Hugo"));
		System.out.println(vetor.busca(8));
		
	}
}
