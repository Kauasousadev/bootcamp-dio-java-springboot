package Collections.Set.ordenacao;

import java.util.*;

public class CadastroProduto {
    private
        Set<Produto> listaProdutos;

    public CadastroProduto(){
        this.listaProdutos = new HashSet<>();
    }

    public void adicionarProdutos(String nome, int cod, Double preco, int quantidade){
        listaProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(listaProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());

        produtosPorPreco.addAll(listaProdutos);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProdutos("Bola de futebol", 1, 50d, 1);
        cadastroProduto.adicionarProdutos("Bola de basquete", 2, 60d, 1);
        cadastroProduto.adicionarProdutos("Bola de volei", 3, 30d, 1);

        System.out.println(cadastroProduto.exibirProdutosPorNome());
        System.out.println(cadastroProduto.exibirPorPreco());
    }
}
