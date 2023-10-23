package model;

public abstract class Funcionario {
    public String nome;
    public double salario;

    // Constructor
    public Funcionario() {
    }
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }
    // End Constructor

    // Getter and Setter
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    // End Getter and Setter

    // ??? --> ; e não {}
    public abstract double getBonus();
}
