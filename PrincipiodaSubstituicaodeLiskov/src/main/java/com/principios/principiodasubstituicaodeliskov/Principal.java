package com.principios.principiodasubstituicaodeliskov;

/**
 *
 * @author Ingrid
 */
public class Principal {

    public static void main(String[] args) {
        try {
            ContaCorrente contaCorrente = new ContaCorrente();
            ContaSalario contaSalario = new ContaSalario();
            
            contaCorrente.deposita(200);
            contaCorrente.saca(100);
            contaCorrente.rende();
            
            contaSalario.deposita(350);
            contaSalario.saca(50);
            
            System.out.println(contaCorrente);
            System.out.println(contaSalario);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    }
    
}
