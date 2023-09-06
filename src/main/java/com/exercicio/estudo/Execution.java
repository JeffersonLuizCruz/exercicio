package com.exercicio.estudo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Execution {

	public static void main(String[] args) {
		Arrays.stream(countBy(2,5)).forEach(System.out::println);
	}

	  public static int[] countBy(int x, int n){
		    return IntStream.range(x, n).toArray();
		  }
}
