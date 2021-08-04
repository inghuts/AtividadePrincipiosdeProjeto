package com.principios.principiodaresponsabilidadeunica;

/**
 *
 * @author Ingrid
 */
public class CalculoBonus {
    
    private double bonus;
    private double salarioFinal;

    public CalculoBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }
    
    public double calcularBonus(Funcionario funcionario) {
        salarioFinal = funcionario.getSalario() + bonus;
        return salarioFinal;
    }
    
    public double getSalarioFinal() {
        return salarioFinal;
    }
    
    @Override
    public String toString() {
        return "Salário Com Bônus: " +salarioFinal+ "\n";
    }
    
}
