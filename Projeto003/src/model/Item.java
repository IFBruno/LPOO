package model;

public class Item {
    // Atributos
    private  int codItem;
    private double desconto;
    private int quantidade;

    // Ligações, recebe 1 produto...
    private Produto produto;
    // -------------------------------------------------- End Ligações
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Item() {}
    public Item(int codItem, double desconto, int quantidade) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
    }
    public Item(int codItem, double desconto, int quantidade, Produto produto) {
        this.codItem = codItem;
        this.desconto = desconto;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public int getCodItem() {
        return codItem;
    }
    public void setCodItem(int codItem) {
        this.codItem = codItem;
    }
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
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
        return "Item -> " +
                "Codigo: " + codItem +
                ", Quantidade: " + quantidade +
                " " + produto;
    }
    // --------------------------------------------------> End ToString
}