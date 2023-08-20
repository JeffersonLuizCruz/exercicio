package com.exercicio.estudo.interfaces;

public class EstudoInterfaceDefaultEStatic {

	public interface DescontoCalculavel {
	    double calcularDesconto(double valor);
	    
	    // Método estático na interface
	    static double calcularDescontoAdicional(double valor, double descontoBase) {
	        return valor * (descontoBase / 100);
	    }
	    
	    default double calcularDescontoAdicionalV2(double valor, double descontoBase) {
	        return valor * (descontoBase / 100);
	    }
	}
	
	public static class Produto implements DescontoCalculavel {
	    private double preco;

	    public Produto(double preco) {
	        this.preco = preco;
	    }

	    @Override
	    public double calcularDesconto(double valor) {
	        return preco * (valor / 100);
	    }
	}
	
    public static void main(String[] args) {
        Produto produto = new Produto(100.0);
        double desconto = produto.calcularDesconto(10.0);
        System.out.println("Desconto: " + desconto);

        double descontoAdicional = DescontoCalculavel.calcularDescontoAdicional(100.0, 5.0);
        System.out.println("Desconto adicional: " + descontoAdicional);
        
        double descontoAdicionalV2 = produto.calcularDescontoAdicionalV2(100.0, 5.0);
        System.out.println("Desconto adicional: " + descontoAdicionalV2);
    }
}
