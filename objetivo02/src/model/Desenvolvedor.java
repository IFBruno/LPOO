package model;

public class Desenvolvedor extends Funcionario{

    // Constructor
    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }
    // End Constructor

    // Objetivo 2 pede para imprimir bônus de funcionarios + Bônus de 5% para Desenvolvedor...
    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    // To String
    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
