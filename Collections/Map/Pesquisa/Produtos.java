package Collections.Map.Pesquisa;

public class Produtos {
    private
        String nome;
        Double preco;
        Integer quantidade;
    
    public Produtos(String nome, Double preco, Integer quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }
    public Double getPreco() {
        return preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return nome + " " + preco + " " + quantidade;
    }
}
