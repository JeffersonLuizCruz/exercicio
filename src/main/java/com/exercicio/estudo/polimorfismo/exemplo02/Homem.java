package com.exercicio.estudo.polimorfismo.exemplo02;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Homem implements HomemV2Service{
    private String name;
    private Integer idade;
    private String sexo;

    @Override
    public String getNomev2() {
        return this.name;
    }

    @Override
    public Integer getIdadev2() {
        return this.idade;
    }

    @Override
    public String getSexov2() {
        return this.sexo;
    }
}
