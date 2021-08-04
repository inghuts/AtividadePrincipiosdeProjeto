package com.principios.principiodainversaodedependencia;

/**
 *
 * @author Ingrid
 */
public class Botao {
    
    private Dispositivo dispositivo;
    
    public Botao(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }
    
    public void acionar() {
        if ("off".equals(dispositivo.getEstado())) {
            dispositivo.ligar();
        }else {
            dispositivo.desligar();
        }
    }
    
}
