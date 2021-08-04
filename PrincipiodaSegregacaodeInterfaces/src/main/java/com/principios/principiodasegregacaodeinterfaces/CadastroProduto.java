package com.principios.principiodasegregacaodeinterfaces;

/**
 *
 * @author Ingrid
 */
public class CadastroProduto implements ICadastroProduto{
    
    @Override
    public void validarDados() {
        System.out.println("Validando dados!");
    }
    
    @Override
    public void salvarBanco() {
        System.out.println("Salvando no banco!");
    }
    
}
