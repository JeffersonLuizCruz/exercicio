package com.exercicio.estudo.codwars;

public class Exercicio02 {
	/*
	 * Depois de um período difícil no escritório, você decide descansar um pouco
	 * nas férias. Então você vai reservar um voo para você e sua namorada e tentar
	 * deixar toda a bagunça para trás.
	 * 
	 * Você precisará de um carro alugado para se locomover em suas férias. O
	 * gerente da locadora de veículos faz algumas boas ofertas.
	 * 
	 * Cada dia que você aluga o carro custa US$ 40. Se você alugar o carro por 7 ou
	 * mais dias, receberá $ 50 de desconto no total. Alternativamente, se você
	 * alugar o carro por 3 ou mais dias, você receberá $ 20 de desconto no total.
	 * 
	 * Escreva um código que forneça o valor total para dias diferentes (d).
	 */
	public static int rentalCarCost(int d) {
		if(d >= 7) return (40 * d) - 50;
		if(d >= 3) return (40 * d) - 20;
		
		return (40 * d);
	}
}
