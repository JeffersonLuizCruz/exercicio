package com.exercicio.estudo;

import java.util.stream.IntStream;

public class Execution {
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
