package Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));

    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()){
            for(Produto p: estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }


    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;

        double maiorPreco = Double.MIN_VALUE;
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco){
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }

        return produtoMaisCaro;
    }




    public static void main(String[] args) {
          EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

          estoqueProdutos.adicionarProduto(1L, "x", 1, 1);
          estoqueProdutos.adicionarProduto(6L, "a", 1, 2);
          estoqueProdutos.adicionarProduto(7L, "b", 1, 3);
          estoqueProdutos.adicionarProduto(8L, "c", 1, 10);
          estoqueProdutos.adicionarProduto(5L, "d", 1, 5);
          estoqueProdutos.adicionarProduto(4L, "e", 1, 6);
          estoqueProdutos.adicionarProduto(3L, "f", 1, 7);

        estoqueProdutos.exibirProdutos();
        System.out.println("\n");
        System.out.println(estoqueProdutos.obterProdutoMaisCaro() + "\n");
        System.out.println(estoqueProdutos.calcularValorTotalEstoque() + "\n");

    }
}
