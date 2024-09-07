package Collections.Map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produtos> estoque;

    public EstoqueProdutos(){
        this.estoque = new HashMap<>();
    }

    public void adicionarProduto(Long cod, String nome, Double preco, Integer quantidade){
        estoque.put(cod, new Produtos(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoque);
    }

    public Double calcularValorTotalEstoque(){
        Double valorTotalEstoque = 0d;
        if (!estoque.isEmpty()) {
            for(Produtos p : estoque.values()){
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produtos obterProdutoMaiorPreco(){
        Double maiorPreco = Double.MIN_VALUE;
        Produtos produtoMaisCaro = null;
        if (!estoque.isEmpty()) {
            for(Produtos p : estoque.values()){
                if (p.getPreco() > maiorPreco) {
                    maiorPreco = p.getPreco();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMenorPreco(){
        Double menorPreco = Double.MAX_VALUE;
        Produtos produtoMaisBarato = null;
        if (!estoque.isEmpty()) {
            for(Produtos p : estoque.values()){
                if (p.getPreco() < menorPreco) {
                    menorPreco = p.getPreco();
                    produtoMaisBarato = p;
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produtos obterProdutoMaiorQuantidadeValor(){
        Double maiorPreco = Double.MIN_VALUE;
        Produtos produtoMaisCaro = null;
        if (!estoque.isEmpty()) {
            for(Produtos p : estoque.values()){
                if ((p.getPreco()*p.getQuantidade()) > maiorPreco) {
                    maiorPreco = p.getPreco() * p.getQuantidade();
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();

        estoque.adicionarProduto(1L, "Raquete de mosquito", 20d, 4);;
        estoque.adicionarProduto(2L, "Raquete de tênis", 40d, 2);;
        estoque.adicionarProduto(3L, "Raquete de ping-pong", 30d, 2);;
        estoque.adicionarProduto(4L, "Raquete de badmington", 70d, 1);;

        System.out.println(estoque.obterProdutoMaiorPreco());
        System.out.println(estoque.obterProdutoMenorPreco());
        System.out.println(estoque.obterProdutoMaiorQuantidadeValor());
    }
}
