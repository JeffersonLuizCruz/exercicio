package com.exercicio.estudo.polimorfismo.exemplo02;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;

public class execution {
    public static void main(String[] args) {
        List<Homem> homens = new ArrayList<>();
        homens.add(new Homem("Jefferson", 32, "Masculino"));
        homens.add(new Homem("Hugo", 32, "Masculino"));
        homens.add(new Homem("Luiz", 32, "Masculino"));

        List<Homem> newHomens = new ArrayList<>();
        List<HomemV2> newHomensV2 = new ArrayList<>();

        for (HomemV2Service h : homens){
            Homem homem = new Homem(h.getNomev2(), h.getIdadev2(), h.getSexov2());
            newHomens.add(homem);

            HomemV2 homemV2 = new HomemV2(h.getNomev2(), h.getIdadev2(), h.getSexov2(), "Rua Cavalo Marinho");
            newHomensV2.add(homemV2);
        }

        newHomens.forEach(System.out::println);
        System.out.println("-----------------");
        newHomensV2.forEach(System.out::println);

    }
}
