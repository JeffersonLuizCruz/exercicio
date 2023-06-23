package com.exercicio.estudo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public enum Enum01 {

	SEGUNDA("Seg", 1), TERCA("ter", 2), QUARTA("Quar", 3), QUITA("Qui", 4), SEXTA("sex", 5);
	
	private String description;
	private Integer number;
	
}
