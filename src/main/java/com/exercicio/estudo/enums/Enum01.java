package com.exercicio.estudo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum Enum01 {

	SEGUNDA("Seg", 1), TERCA("Ter", 2), QUARTA("Quar", 4), QUITA("Qui", 5), SEXTA("Sex", 6);
	
	private String description;
	private Integer number;
	
}
