package com.exercicio.estudo.lista;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Lista21 {

	public static String search(List<String> list, String name){
		Collections.sort(list);
		int binarySearch = Collections.binarySearch(list, name);
		if(binarySearch >= 0) {
			return name;
		}else {
			return "Não encontrado";
		}
	}
	
	public static void main(String[] args) {
		List<String> listStr = Arrays.asList("Hugo", "Jeff", "Luiz", "Jefferson", "Carol", "Oliveira");
		
		System.out.println(search(listStr,"Hugo"));
	}
}
