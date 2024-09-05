package Collections.List.carrinhodecompra;

public class Item {
    private
        String nome;
        double preço;
        int quantidade;

    public Item(String nome, double preço, int quantidade){
        this.nome = nome;
        this.preço = preço;
        this.quantidade = quantidade;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setPreço(double preço) {
        this.preço = preço;
    }
    public double getPreço() {
        return preço;
    }
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return nome + preço + quantidade;
    }
}
