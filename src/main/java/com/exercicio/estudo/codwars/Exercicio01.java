package com.exercicio.estudo.codwars;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Exercicio01 {

	/*
	 * Complete a função para que ela encontre a média das três notas passadas e
	 * retorne o valor da letra associada a essa nota.
	 *
	 * Pontuação Numérica Nota da carta 
	 * 90 <= pontuação <= 100 'A' 
	 * 80 <= pontuação <90 'B' 
	 * 70 <= pontuação <80 'C' 
	 * 60 <= pontuação <70 'D' 
	 * 0 <= pontuação <60  'F'
	 */
	
	public static char getGrade(int s1, int s2, int s3) {
		int average = (int) Arrays.asList(s1, s2, s3).stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);

		boolean A = (average >= 90);
		boolean B = (average >= 80);
		boolean C = (average >= 70);
		boolean D = (average >= 60);
		
		if(A) return 'A';
		if(B) return 'B';
		if(C) return 'C';
		if(D) return 'D';
		
		return 'F';
	}
	
	public static char getGradeV2(int s1, int s2, int s3) {
		int average = (int) Arrays.asList(s1, s2, s3).stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);
		if(average >= 90) return 'A';
		if(average >= 80) return 'B';
		if(average >= 70) return 'C';
		if(average >= 60) return 'D';
		
		return 'F';
	}

	public static char getGradeV3(int s1, int s2, int s3) {
		int average = (int) Arrays.asList(s1, s2, s3).stream()
				.mapToInt(Integer::intValue)
				.average()
				.orElse(0);

		switch (average / 10 ) {
			case 9: return 'A';
			case 8: return 'B';
			case 7: return 'C';
			case 6: return 'D';
			default: return 'F';
		}
	}

	public static char getGradeV4(int... args) {
		double average = Arrays.stream(args).average().orElse(0);
		if(average > 90) return 'A';
		if(average > 80) return 'B';
		if(average > 70) return 'C';
		if(average > 60) return 'D';

		return 'F';
	}
	public static void main(String[] args) {
		
		System.out.println(getGrade(70, 80, 85));
		System.out.println(getGradeV2(70, 80, 85));
		System.out.println(getGradeV3(70, 80, 85));
		System.out.println(getGradeV4(50, 52, 45));
	}
}
