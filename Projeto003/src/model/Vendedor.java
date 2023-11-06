package model;

import java.util.ArrayList;
import java.util.List;

// Vendedor recebe (extends) atributos de Funcionario...
public class Vendedor extends Funcionario{
    // Atributos
    private String local;

    // Ligações, recebe list de Pedido (Um Vendedor possui vários pedidos)...
    private List<Pedido> pedidos = new ArrayList<>();
    // -------------------------------------------------- End Ligaçẽos
    // -------------------------------------------------- End Atributos

    // Constructor...
    public Vendedor() {}
    public Vendedor(String local, List<Pedido> pedidos) {
        this.local = local;
        this.pedidos = pedidos;
    }
    public Vendedor(int matricula, String nome, String endereco, String bairro, String cep, String cidade, String estado, String local) {
        super(matricula, nome, endereco, bairro, cep, cidade, estado);
        this.local = local;
    }
    // -------------------------------------------------- End Constructor

    // Getter and Setter (Pegar e Marcar/Mudar)...
    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public List<Pedido> getPedidos() {
        return pedidos;
    }
    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
    // --------------------------------------------------> End Getter and Setter (Pegar e Marcar/Mudar)

    // ToString (Juntando os Atributos)...
    @Override
    public String toString() {
        return "Vendedor -> " +
                "Matricula: " + getMatricula() +
                ", Nome: " + getNome();
                //", Local: " + local;
    }
    // --------------------------------------------------> End ToString
}