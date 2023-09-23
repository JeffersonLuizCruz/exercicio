package com.exercicio.estudo.codwars;

import java.util.stream.IntStream;

public class Exercicio08 {
	/*
	 * Exercício de manipulação de CHAR com streams
	 **/
	public static void main(String[] args) {
		String str = "Hugo Luiz Cruz";
		
		IntStream chars = str.chars();
		
		String string = chars.filter(Character::isUpperCase)
				.mapToObj(Character::toString)
		.collect(StringBuilder::new, 
				StringBuilder::append, StringBuilder::append).toString();
		
		System.out.println(string);
	}
}
