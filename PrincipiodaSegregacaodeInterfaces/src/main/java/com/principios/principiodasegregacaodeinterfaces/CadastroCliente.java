package com.principios.principiodasegregacaodeinterfaces;

/**
 *
 * @author Ingrid
 */
public class CadastroCliente implements ICadastroCliente{
    
    @Override
    public void validarDados() {
        System.out.println("Validando dados!");
    }
    
    @Override
    public void salvarBanco() {
        System.out.println("Salvando no banco!");
    }
    
    @Override
    public void enviarEmail() {
        System.out.println("Enviando email!");
    }
    
}
