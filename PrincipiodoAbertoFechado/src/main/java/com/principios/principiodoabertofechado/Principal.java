package com.principios.principiodoabertofechado;

/**
 *
 * @author Ingrid
 */
public class Principal {
    
    public static void main(String[] args) {
        try {
            Produto produto1 = new Produto("Arroz 5kg", 30.00, new DescontoAVista());
            Produto produto2 = new Produto("Carne 1kg", 40.00, new DescontoCartao());
            
            produto1.getCalculaDesconto().calcularDesconto(produto1);
            produto2.getCalculaDesconto().calcularDesconto(produto2);
            
            System.out.println(produto1);
            System.out.println(produto2);

        } catch (RuntimeException rte) {
            System.err.println("Falha: " + rte.getMessage());

        }
    }
    
}
