package model;

public class GerenteDesenvolvimento extends Gerente{
    // Constructor
    public GerenteDesenvolvimento() {
    }
    public GerenteDesenvolvimento(String nome, double salario) {
        super(nome, salario);
    }

    //  Bônus diferente... Faz especifico em cada classe
    @Override
    public double getBonus() {
        return getSalario() * 0.20;
    }

    // To String
    @Override
    public String toString() {
        return "GerenteDesenvolvimento{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }
}
