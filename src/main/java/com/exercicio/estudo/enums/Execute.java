package com.exercicio.estudo.enums;
public class Execute{
	public static void main(String[] args) {
		
		/**
		 * Entendo sintaxe de Enum
		 */
		
		Enum01 na1 = Enum01.QUARTA;
		System.out.println(na1);
		System.out.println(Enum01.QUARTA.getDescription());
		System.out.println(Enum01.QUARTA);
		
		System.out.println("--------------------------");
		
		Integer number = Enum01.SEXTA.getNumber();
		System.out.println(number);
		System.out.println(Enum01.QUARTA.getNumber());
		
		System.out.println("--------------------------");
		
		var result = switch(number) {
		case 1, 2, 3 -> "Segunda à Quarta";
		case 4 -> "Quinta-feira";
		case 5 -> "Sexta";
		default -> throw new IllegalStateException("Valor inexperado: " + number);
		};
		
		System.out.println(result);
	}
}