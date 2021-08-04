package com.principios.principiodasegregacaodeinterfaces;

/**
 *
 * @author Ingrid
 */
public class Principal {

    public static void main(String[] args) {
        CadastroCliente cliente = new CadastroCliente();
        CadastroProduto produto = new CadastroProduto();
        
        cliente.validarDados();
        cliente.salvarBanco();
        cliente.enviarEmail();
        
        produto.validarDados();
        produto.salvarBanco();
    }
    
}
