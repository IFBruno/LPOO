package model;

public class Produto {
    // Atributos...
    private int codigo;
    private String nome;
    private int quantidade;
    private double preco;

    // Ligaçoes, recebe item,
    //           recebe Fornecedor...
    //private Item item;
    private Fornecedor fornecedor;
    // -------------------------------------------------- End Ligações
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Produto() {}
    public Produto(int codigo, String nome, int quantidade, double preco, Fornecedor fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.fornecedor = fornecedor;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public Fornecedor getFornecedor() {
        return fornecedor;
    }
    public void setFornecedor (Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }
    //public Item getItem() {
    //    return item;
    //}
    //public void setItem(Item item) {
    //    this.item = item;
    //}
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando os Atributos)...
    @Override
    public String toString() {
        return "Produto -> " +
                //"Codigo: " + codigo +
                "Nome: " + nome +
                ", Estoque: " + quantidade +
                ", Preco: " + preco +
                " / " + fornecedor;
    }
    // --------------------------------------------------> End ToString
}