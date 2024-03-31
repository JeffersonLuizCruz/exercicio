package com.exercicio.estudo.entity;

import lombok.*;

@Data
@NoArgsConstructor @AllArgsConstructor
public class Client {
    private String name;
    private String email;
    private Integer idade;

    public static void main(String[] args) {
        Client client = new Client();

        client.setName("Hugo");
        client.setEmail("jeff@gmail");
        client.setIdade(25);

        System.out.println("-------------------------------------");
        System.out.println(client);
        System.out.println("-------------------------------------");
    }
}
