package model;

import java.util.ArrayList;
import java.util.List;

public class Fornecedor {
    // Atributos...
    private int cnpj;
    private String contato;
    private String nome;

    // Ligações, recebe list de Produto (Fornecedor pode fornecer mais de 1 produto)...
    private List<Produto> produto = new ArrayList<>();
    // -------------------------------------------------- End Ligaçoes
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Fornecedor() {}
    public Fornecedor(int cnpj, String contato, String nome) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
    }
    public Fornecedor(int cnpj, String contato, String nome, List<Produto> produto) {
        this.cnpj = cnpj;
        this.contato = contato;
        this.nome = nome;
        this.produto = produto;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public int getCnpj() {
        return cnpj;
    }
    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }
    public String getContato() {
        return contato;
    }
    public void setContato(String contato) {
        this.contato = contato;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Produto> getProduto() {
        return produto;
    }
    public void setProduto(List<Produto> produto) {
        this.produto = produto;
    }
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando todos Atributos)...
    @Override
    public String toString() {
        return "Fornecedor -> " +
                "CNPJ: " + cnpj +
                ", Contato: " + contato +
                ", Nome: " + nome
                //", Produto: " + produto +
                ;
    }
    // --------------------------------------------------> End ToString
}