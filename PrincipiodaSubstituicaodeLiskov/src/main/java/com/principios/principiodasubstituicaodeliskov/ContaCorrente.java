package com.principios.principiodasubstituicaodeliskov;

/**
 *
 * @author Ingrid
 */
public class ContaCorrente {
    
    private GerenciadorDeContas gerenciador;

    public ContaCorrente() {
        this.gerenciador = new GerenciadorDeContas();
    }
    
    public double getSaldo() {
        return this.gerenciador.getSaldo();
    }

    public void deposita(double valor) {
        this.gerenciador.deposita(valor);
    }
    
    public void saca(double valor) {
    	this.gerenciador.saca(valor);
    }

    public void rende()      {
        this.gerenciador.rende(0.02);
    } 
    
    @Override
    public String toString() {
        return "Saldo Conta Corrente: " +getSaldo()+ "\n";
    }
    
}
