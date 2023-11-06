package model;

public class Fornecimento {
    // Atributos...
    private String data;
    private double valorUni;
    private int quantidade;

    // Ligações, recebe Fornecedor e Produto, armazena com data e valor...
    private Fornecedor fornecedor;
    private Produto produto;
    // -------------------------------------------------- End Ligações
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Fornecimento() {}
    public Fornecimento(String data, double valorUni, int quantidade ,Fornecedor fornecedor, Produto produto) {
        this.data = data;
        this.valorUni = valorUni;
        this.quantidade = quantidade;
        this.fornecedor = fornecedor;
        this.produto = produto;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValorUni() {
        return valorUni;
    }
    public void setValorUni(double valorUni) {
        this.valorUni = valorUni;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando os Atributos)...
    @Override
    public String toString() {
        return "Fornecimento -> " +
                "Data: " + data +
                ", Valor Unidade: " + valorUni +
                ", Quantidade: " + quantidade +
                "\n   " + fornecedor +
                "\n   " + produto;
    }
    // --------------------------------------------------> End ToString
}