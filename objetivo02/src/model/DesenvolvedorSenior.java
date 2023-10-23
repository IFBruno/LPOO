package model;

public class DesenvolvedorSenior extends Desenvolvedor{
    // Constructor
    public DesenvolvedorSenior() {
    }
    public DesenvolvedorSenior(String nome, double salario) {
        super(nome, salario);
    }

    // Bônus diferente... Faz especifico em cada classe
    @Override
    public double getBonus() {
        return getSalario() *0.10;
    }

    // To String
    @Override
    public String toString() {
        return "DesenvolvedorSenior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
