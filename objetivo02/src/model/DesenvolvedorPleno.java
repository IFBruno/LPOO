package model;

public class DesenvolvedorPleno extends Desenvolvedor{
    // Constructor
    public DesenvolvedorPleno() {
    }
    public DesenvolvedorPleno(String nome, double salario) {
        super(nome, salario);
    }

    // Bônus diferente... Faz especifico em cada classe
    @Override
    public double getBonus() {
        return getSalario() * 0.05;
    }

    // To String
    @Override
    public String toString() {
        return "DesenvolvedorPleno{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
