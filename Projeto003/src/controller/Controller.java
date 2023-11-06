package controller;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class Controller {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Criando Fornecedores
        Fornecedor for1 = new Fornecedor(101, "Telefone", "Lancheria");
        Fornecedor for2 = new Fornecedor(102, "Telefone", "Bebidas");
        //System.out.println(for1);

        // Criando Vendedores
        Vendedor ven1 = new Vendedor(201, "Bruno", "Fernando Ośorio", "Centro", "378", "Pelotas", "RS", "Pelotas");
        Vendedor ven2 = new Vendedor(202, "Luis", "Marcilio Dias", "Centro", "567", "Pelotas", "RS", "Pelotas");
        //System.out.println(ven1);

        // Criando Produtos
        Produto pro1 = new Produto(301, "Bauru", 10, 15.0, for1){};
        Produto pro2 = new Produto(302, "Refri", 15, 8.5, for2){};
        Produto pro3 = new Produto(303, "Salada", 20, 9.0, for1){};
        Produto pro4 = new Produto(304, "Suco", 25, 6.5, for2){};
        //System.out.println(pro1);

        Item ite1 = new Item(301, 0, 2, pro1);
        Item ite2 = new Item(302, 0, 1, pro2);
        Item ite3 = new Item(303, 0, 3, pro3);
        Item ite4 = new Item(304, 0, 2, pro4);
        //System.out.println(ite1);

        List<Item> itens = new ArrayList<>();
            // Adicionando Produtos na lista
            itens.add(ite1);
            itens.add(ite2);

        // Primeiro pedido/venda
        double precos = pro1.getPreco() + pro2.getPreco(); // Calculando Preço
        Pedido ped1 = new Pedido(1, "2023/10/05", precos, ven1, itens);
        System.out.println(" ");
        System.out.println("B: Vendas");
        System.out.println("1º Pedido! ");

        // imprimir quantidade de itens no pedido, um por um...
        int linhas = itens.size();
        for (int i = 0; i < linhas; i++){
            System.out.println("   " + ped1.getItens().get(i));
        }

        System.out.println("   Total do Pedido -> R$: "+ ped1.getValor());
        System.out.println("   " + ped1.getVendedor());

        ped1.setSituacao(Situacao.ENTREGUE);

        // Se pedido entregue remove quantidade de item do estoque
        if (ped1.getSituacao() == Situacao.ENTREGUE) {
            int qtd1 = ite1.getQuantidade();
            pro1.setQuantidade(pro1.getQuantidade() - qtd1);
            System.out.println("   " + pro1.getNome() + " -> " + "Estoque Atualizado: " + pro1.getQuantidade());

            int qtd2 = ite2.getQuantidade();
            pro2.setQuantidade(pro2.getQuantidade() - qtd2);
            System.out.println("   " + pro2.getNome() + " -> " + "Estoque Atualizado: " + pro2.getQuantidade());
        }

        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(ped1);
        int size = ped1.getItens().size();

        // Limpando lista para segundo pedido
        // lista do pedido 1 não apresentaria mais os itens ...
        //itens.clear();
        // Adicionando novos produtos
        int newInit = itens.size();
            itens.add(ite3);
            itens.add(ite4);

        // itens.size tamanho atual da lista menos size itens já enviados para pedidos)
        int newSize = itens.size();
        //System.out.println(" Size" + newSize + " Init" + newInit);

        // Segundo pedido/venda
        precos = pro3.getPreco() + pro4.getPreco(); // Calculando Preço
        Pedido ped2 = new Pedido(2, "2023/10/05", precos, ven2, itens.subList(newInit, newSize));
        System.out.println("\n2º Pedido! ");

        // imprimir quantidade de itens no pedido, um por um...
        for (int i = 0; i < linhas; i++){
            System.out.println("   " + ped2.getItens().get(i));
        }

        System.out.println("   Total do Pedido -> R$: "+ ped2.getValor());
        System.out.println("   " + ped2.getVendedor());

        ped2.setSituacao(Situacao.ENTREGUE);
        //System.out.println(ped2);

        // Se pedido entregue remove quantidade de item do estoque
        if (ped2.getSituacao() == Situacao.ENTREGUE) {
            int qtd3 = ite3.getQuantidade();
            pro3.setQuantidade(pro3.getQuantidade() - qtd3);
            System.out.println("   " + pro3.getNome() + " -> " + "Estoque Atualizado: " + pro3.getQuantidade());

            int qtd4 = ite4.getQuantidade();
            pro4.setQuantidade(pro4.getQuantidade() - qtd4);
            System.out.println("   " + pro4.getNome() + " -> " + "Estoque Atualizado: " + pro4.getQuantidade());
        }

        pedidos.add(ped2);

        //System.out.println("\n   Lista de Pedidos: ");
        //int linhasPedidos = pedidos.size();
        // // pedido 1 esta pegando novos itens do pedido 2
        //for (int i = 0; i < linhasPedidos; i++){
        //    System.out.println("   " + pedidos.get(i));
        //}

        // pedido 1 sem pegar novos itens do pedido 2
        System.out.println("\n   Lista de Pedidos: ");
        System.out.println("   " + ped1.getItens().subList(0, size));
        System.out.println("   " + ped2.getItens());

        // "C: Entrada de Estoque"
        // Fornecimento (Entrada de Novo Estoque)...
        System.out.println("C: Entrada de Estoque");

        //double valor1 = pro1.getPreco();
        //double valor3 = pro3.getPreco();
        Fornecimento fr1 = new Fornecimento("2023/10/05", pro1.getPreco(), 10, for1, pro1);
        Fornecimento fr2 = new Fornecimento("2023/10/05", pro3.getPreco(), 15, for1, pro3);

        //List<Fornecimento> fornecimentos = new ArrayList<>();
        //fornecimentos.add(fr1);
        //fornecimentos.add(fr2);
        System.out.println("   Estoque de "+ pro1.getNome() + ": " + fr1.getProduto().getQuantidade());
        System.out.println("   Estoque de "+ pro3.getNome() + ": " + fr2.getProduto().getQuantidade());

        // Entrada de estoques
        pro1.setQuantidade(fr1.getProduto().getQuantidade() + fr1.getQuantidade());
        System.out.println("\n   Nova Entrada de Estoque de "+ pro1.getNome() + ": " + pro1.getQuantidade());
        pro3.setQuantidade(fr2.getProduto().getQuantidade() + fr2.getQuantidade());
        System.out.println("   Nova Entrada de Estoque de "+ pro3.getNome() + ": " + pro3.getQuantidade());

        System.out.println("\n   Fornecimentos: ");
        System.out.println("1º " + fr1);
        System.out.println("2º " + fr2);

        // Valores novo estoque
        double valorTotal1 = fr1.getValorUni() * fr1.getQuantidade();
        double valorTotal2 = fr2.getValorUni() * fr2.getQuantidade();
        System.out.println("\n   Valor Total Gasto para Reabastecer 1 -> R$: " + valorTotal1);
        System.out.println("   Valor Total Gasto para Reabastecer 2 -> R$: " + valorTotal2);

        //double valorTotal = fr1.getValorUni() * fr1.getQuantidade() + fr2.getValorUni() * fr2.getQuantidade();
        double valorTotal = valorTotal1 + valorTotal2;
        System.out.println("   Valor Total Gasto para Novo Estoque  -> R$: " + valorTotal);

        System.out.println("\n   Menu para Testar Exceções: ");
        System.out.println("   * " + pro1.getQuantidade() + " Itens (Bauru) em Estoque * ");
        System.out.println("   Digite a Qtd de Itens para Carrinho: ");
        int qtdItens1 = scan.nextInt();

        System.out.println("   * " + pro3.getQuantidade() + " Itens (Salada) em Estoque * ");
        System.out.println("   Digite a Qtd de Itens para Carrinho: ");
        int qtdItens3 = scan.nextInt();

        //if (pro1.getQuantidade() >= ite1.getQuantidade() && pro3.getQuantidade() >= ite3.getQuantidade()) {
        if (pro1.getQuantidade() >= qtdItens1 && pro3.getQuantidade() >= qtdItens3) {
            System.out.println("Tudo OK! Estoque Disponível! ");
        } else comportamento();
    }
    private static void comportamento(){
        mythrowException();
    }
    private static void mythrowException(){
        try{
            //System.err.println("   Quantidade de Itens Indisponível! ");
            throw new EstoqueIndisponivel();
        }catch (EstoqueIndisponivel e){
            //e.printStackTrace();
            System.err.println(e.getMessage());
        } finally {
            System.err.println("   Finalizando... ");
            exit(0);
        }
    }
    static class EstoqueIndisponivel extends Exception {
        public  EstoqueIndisponivel(){
            super("   Estoque Insuficiente! ");
        }
    }
}