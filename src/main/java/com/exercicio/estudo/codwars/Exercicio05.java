package com.exercicio.estudo.codwars;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercicio05 {
	/*
	 * Desta vez, sem história, sem teoria. Os exemplos abaixo mostram como escrever
	 * function accum:
	 * 
	 * Exemplos: 
	 * accum("abcd") -> "A-Bb-Ccc-Dddd" 
	 * accum("RqaEzty") -> "R-Qq-Aaa-Eeee-Zzzzz-Tttttt-Yyyyyyy" 
	 * accum("cwAt") -> "C-Ww-Aaa-Tttt"
	 */

	public static void mainv(String[] args) {
		System.out.println(accum("abcd"));
	}

	public static String accum(String s) {
		String[] splitStr = s.split("");
		String collect = IntStream.range(0, splitStr.length)
		.mapToObj(i -> splitStr[i].toUpperCase() + splitStr[i].repeat(i))
		.collect(Collectors.joining("-"));
		return collect;
	}

	public static String accum_v2(String str) {
		String[] strSplit = str.split("");
		String separator = "-";
		String acumulator = "";

		for(int i = 0; i < strSplit.length; i++){
			acumulator += strSplit[i].toUpperCase() + strSplit[i].repeat(i) + separator;
		}
		acumulator = acumulator.substring(0, acumulator.length() -1);
		System.out.println(acumulator);
		return acumulator;
	}

	public static void main(String[] args) {
		accum_v2("hugo");
	}
}
