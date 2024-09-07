package Collections.Set.ordenacao;

import java.util.Objects;
import java.util.Comparator;

public class Produto implements Comparable<Produto>{
    private
        String nome;
        int cod;
        Double preco;
        int quantidade;

    public Produto(String nome, int cod, Double preco, int quantidade){
        this.nome = nome;
        this.cod = cod;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    @Override
    public int compareTo(Produto p) {
        return nome.compareToIgnoreCase(p.getNome());
    }

    @Override
    public String toString() {
        return nome + " " + cod + " " + preco + " " + quantidade;
    }
}
class ComparatorPorPreco implements Comparator<Produto>{
    @Override
    public int compare(Produto o1, Produto o2) {
        // TODO Auto-generated method stub
        return Double.compare(o1.getPreco(), o2.getPreco());
    }
}