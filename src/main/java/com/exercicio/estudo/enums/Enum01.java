package com.exercicio.estudo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum Enum01 {

	SEGUNDA("Seg"), TERCA("ter"), QUARTA("Quar"), QUITA("Qui"), SEXTA("sex");
	
	private String description;
	
}
