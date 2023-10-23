package model;

public class DesenvolvedorJunior extends Desenvolvedor{
    // Constructor
    public DesenvolvedorJunior() {
    }
    public DesenvolvedorJunior(String nome, double salario) {
        super(nome, salario);
    }
    // End Constructor

    // Bônus diferente... Faz especifico em cada classe
    @Override
    public double getBonus() {
        return getSalario() *0.05;
    }

    @Override
    public String toString() {
        return "DesenvolvedorJunior{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
