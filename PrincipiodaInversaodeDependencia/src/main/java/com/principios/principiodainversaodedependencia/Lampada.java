package com.principios.principiodainversaodedependencia;

/**
 *
 * @author Ingrid
 */
public class Lampada implements Dispositivo{
    
    private String estado;

    public Lampada(String estado) {
        this.estado = estado;
    }

    @Override
    public String getEstado() {
        return estado;
    }
    
    @Override
    public void ligar() {
        estado = "on";
    }
    
    @Override
    public void desligar() {
        estado = "off";
    }
    
    @Override
    public String toString() {
        return "Estado: " +getEstado()+ "\n";
    }
    
}
