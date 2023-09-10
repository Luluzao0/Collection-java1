package Set.Ordenacao;

import java.util.*;

public class CadastroProdutos {

    private Set<Produtos> produtosSet;

    public CadastroProdutos() {
        this.produtosSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtosSet.add(new Produtos(cod, nome, preco, quantidade));

    }

    public Set<Produtos> exibirProdutosPorNome(){
        Set<Produtos> produtosPorNome = new TreeSet<>(produtosSet);
        return produtosPorNome;

    }


    public Set<Produtos> exibirProdutosPorPreco(){
        Set<Produtos> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtosSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L, "Milho",15d,6);
        cadastroProdutos.adicionarProduto(6L, "Mamao",5d,6);
        cadastroProdutos.adicionarProduto(7L, "Filé",11d,6);
        cadastroProdutos.adicionarProduto(4L, "Acebolado",12d,6);
        cadastroProdutos.adicionarProduto(5L, "Papaya",10d,6);
        cadastroProdutos.adicionarProduto(8L, "Pitaya",16d,6);
        cadastroProdutos.adicionarProduto(9L, "Morango",11.5d,6);



        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println(cadastroProdutos.exibirProdutosPorPreco());


    }
}
