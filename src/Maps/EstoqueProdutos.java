package Maps;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    private void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }
    private void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }
    private double calcularValorTotalEstoque(){
        double total = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                total += p.getPreco() * p.getQuantidade();
            }
        }
        return total;
    }
    private Produto obterProdutoMaisCaro(){
        Produto maisCaro = null;
        double preco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() > preco){
                    maisCaro = p;
                }
            }
        }
        return maisCaro;
    }
    private Produto obterProdutoMaisBarato(){
        Produto maisBarato = null;
        double preco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()){
                if (p.getPreco() < preco){
                    maisBarato = p;
                    preco = p.getPreco();
                }
            }
        }
        return maisBarato;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(1, "xiaomi a2", 5, 549.00);
        estoqueProdutos.adicionarProduto(2, "xiaomi 13c", 2, 999.00);
        estoqueProdutos.adicionarProduto(3, "xiaomi note 13", 3, 1499.00);
        estoqueProdutos.adicionarProduto(4, "xiaomi note 13 pro", 2, 1999.00);
        estoqueProdutos.exibirProdutos();
        System.out.println(estoqueProdutos.calcularValorTotalEstoque());
        System.out.println(estoqueProdutos.obterProdutoMaisCaro());
        System.out.println(estoqueProdutos.obterProdutoMaisBarato());


    }

}
