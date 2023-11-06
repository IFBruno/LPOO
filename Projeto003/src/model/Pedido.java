package model;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // Atributos
    private int numero;
    private String data;
    private double valor;

    // Ligações, verifica a situação do pedidio
    //           recebe 1 Vendedor
    //           recebe list de Item, Pedido tem 1 ou muitos itens
    private Situacao situacao;
    private Vendedor vendedor;
    private List<Item> itens = new ArrayList<>();
    // -------------------------------------------------- End Ligações
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Pedido() {}
    public Pedido(int numero, String data, double valor, Vendedor vendedor, List<Item> itens) {
        this.numero = numero;
        this.data = data;
        this.valor = valor;
        this.vendedor = vendedor;
        this.itens = itens;
        this.situacao = Situacao.PENDENTE;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    public Vendedor getVendedor() {
        return vendedor;
    }
    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }
    public List<Item> getItens() {
        return itens;
    }
    public void setItens(List<Item> itens) {
        this.itens = itens;
    }

    public Situacao getSituacao() {
        return situacao;
    }
    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando os Atributos)...
    @Override
    public String toString() {
        return "Pedido -> " + numero +
                ", Data: " + data +
                ", Valor: " + valor +
                " / " + vendedor +
                " / " + itens;
    }
    // --------------------------------------------------> End ToString
}