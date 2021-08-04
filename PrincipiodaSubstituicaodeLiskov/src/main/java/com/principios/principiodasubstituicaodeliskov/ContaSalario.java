package com.principios.principiodasubstituicaodeliskov;

/**
 *
 * @author Ingrid
 */
public class ContaSalario {
    
    private GerenciadorDeContas gerenciador;

    public ContaSalario() {
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
    
    @Override
    public String toString() {
        return "Saldo Conta Salário: " +getSaldo()+ "\n";
    }
    
}
