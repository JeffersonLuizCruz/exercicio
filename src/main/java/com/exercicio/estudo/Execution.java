package com.exercicio.estudo;

import java.util.ArrayList;
import java.util.List;

public class Execution {
	public static void main(String[] args) {
		// teste
		List<String> strs = new ArrayList<>();
		strs.add("Hugo");
		strs.add("Jeff");
		strs.add("Luiz");
		strs.add("Cruz");
		strs.add("Jefferson");
		
		List<String> subList = strs.subList(0, 3);
		
		subList.forEach(System.out::println);
		
	}
}
