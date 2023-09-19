package com.exercicio.estudo.codwars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicio07 {
	
	/*
	 * Desta vez, sem história, sem teoria. Os exemplos abaixo mostram como escrever
	 * function accum:
	 * 
	 * Exemplos: 
	 * accum("abcd") -> "A-Bb-Ccc-Dddd" 
	 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" 
	 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
	 */

	public static void main(String[] args) {
		System.out.println(accum("abcd"));
	}

	public static String accum(String s) {
		String[] splitStr = s.split("");
		String collect = IntStream.range(0, splitStr.length)
		.mapToObj(i -> splitStr[i].toUpperCase() + splitStr[i].repeat(i))
		.collect(Collectors.joining("-"));
		return collect;
	}
}
