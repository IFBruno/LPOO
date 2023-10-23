package model;

public class Gerente extends Funcionario {

    // Constructor
    public Gerente() {
    }
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    // Objetivo 2 pede para imprimir bônus de funcionarios + Bônus de 20% para Gerente...
    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    // To String
    @Override
    public String toString() {
        return "Gerente{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
