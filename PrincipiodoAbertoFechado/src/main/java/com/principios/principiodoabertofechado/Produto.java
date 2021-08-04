package com.principios.principiodoabertofechado;

/**
 *
 * @author Ingrid
 */
public class Produto {
    
    private String nome;
    private double valor;
    private CalculaDesconto calculaDesconto;
    
    public Produto(String nome, double valor, CalculaDesconto calculaDesconto) {
        this.nome = nome;
        this.valor = valor;
        this.calculaDesconto = calculaDesconto;
    }
    
    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public CalculaDesconto getCalculaDesconto() {
        return calculaDesconto;
    }
    
    @Override
    public String toString() {
        String text = "";
        text += "Produto: " +getNome()+ "\n";
        text += "Valor: " +getValor()+ "\n";
        text += this.getCalculaDesconto().toString();
        return text;
    }
    
}
