package com.principios.principiodaresponsabilidadeunica;

/**
 *
 * @author Ingrid
 */
public class Funcionario {
    
    private String nome;
    private String cargo;
    private double salario;
    private CalculoBonus calculoBonus;

    public Funcionario(String nome, String cargo, double salario, CalculoBonus calculoBonus) {
        this.nome = nome;
        this.salario = salario;
        this.cargo = cargo;
        this.calculoBonus = calculoBonus;
    }

    public String getNome() {
        return nome;
    }
    
    public String getCargo() {
        return cargo;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public CalculoBonus getCalculoBonus() {
        return calculoBonus;
    }
  
    @Override
    public String toString() {
        String text = "";
        text += "Funcionário: " +getNome()+ "\n";
        text += "Cargo: " +getCargo()+ "\n";
        text += this.getCalculoBonus().toString();
        return text;
    }
    
}
