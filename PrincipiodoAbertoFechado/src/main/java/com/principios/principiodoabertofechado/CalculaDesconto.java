package com.principios.principiodoabertofechado;

/**
 *
 * @author Ingrid
 */
public interface CalculaDesconto {
    
    public double getDesconto();
    public double getValorFinal();
    public double calcularDesconto(Produto produto);
    
    @Override
    public String toString();
    
}
