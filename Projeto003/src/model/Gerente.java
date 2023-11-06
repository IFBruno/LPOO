package model;

// Gerente recebe (extends) atributos de Funcionario...
public class Gerente extends Funcionario{
    // Atributos
    private String formacao;
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Gerente() {}
    public Gerente(String formacao) {
        this.formacao = formacao;
    }
    public Gerente(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String formacao) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.formacao = formacao;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public String getFormacao() {
        return formacao;
    }
    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando os Atributos)...
    @Override
    public String toString() {
        return "Gerente{" +
                "formacao='" + formacao + '\'' +
                '}';
    }
    // --------------------------------------------------> End ToString
}