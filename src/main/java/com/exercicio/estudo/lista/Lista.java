package com.exercicio.estudo.lista;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class Lista {
/**
 * 1. Crie um método que receba uma lista de números inteiros 
 * 	  e retorne a soma de todos os elementos.
 * */
	
	// Tradicional
	public static Integer somaTotal(List<Integer> listNumber) {
		Integer count = 0;
		
		for(Integer number : listNumber) {
			count += number;
		}
		return count;
	}
	
	// Método de Referência
	public static int somaTotalReference_v1(List<Integer> listNumber) {
		return listNumber.stream().mapToInt(Integer::intValue).sum();
	}
	
	// Lambda
	public static int somaTotalLambda_v2(List<Integer> listNumber) {
		return listNumber.stream().mapToInt(num -> num).sum();
	}
	
	public static int somaTotalLambda_v3(List<Customer> listNumber) {
		return listNumber.stream().mapToInt(Customer -> Customer.getNum()).sum();
	}
	public static void main(String[] args) {
		List<Integer> numberInteger = Arrays.asList(1, 2, 3, 4, 5);
		List<Customer> numberObject = Arrays.asList(
				new Customer(1), new Customer(2), new Customer(3), new Customer(4)
				);
		
		System.out.println("Tradicional:" + somaTotal(numberInteger));
		System.out.println("Referência:" + somaTotalReference_v1(numberInteger));
		System.out.println("Lambda:" + somaTotalLambda_v3(numberObject));
	}
}
