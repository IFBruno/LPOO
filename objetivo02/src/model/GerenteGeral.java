package model;

public class GerenteGeral extends Gerente{
    // Constructor
    public GerenteGeral() {
    }
    public GerenteGeral(String nome, double salario) {
        super(nome, salario);
    }

    //  Bônus diferente... Faz especifico em cada classe
    @Override
    public double getBonus() {
        return getSalario() * 0.40;
    }

    // To String
    @Override
    public String toString() {
        return "GerenteGeral{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                "} " + super.toString();
    }

    // End Questão 1


}
