package com.exercicio.estudo;

import java.util.Arrays;
import java.util.List;

public class Execution {

	public static void main(String[] args) {
		Result result = new Result();
		
		List<Integer> subsetA = result.subsetA(Arrays.asList(5, 3, 2, 4, 1, 2));
		
		System.out.println(subsetA);
	}
}
