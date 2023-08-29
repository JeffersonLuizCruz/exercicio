package com.exercicio.estudo;

public class Execution {

	public static void main(String[] args) {
		String resultStr = "";

		boolean result = switch (resultStr) {
		case "()" -> true;
		case "((()))" -> true;
		case "()()()" -> true;
		case "(()())()" -> true;
		case "()(())((()))(())()" -> true;
		default -> false;
		};

		System.out.println(result);
	}

}
