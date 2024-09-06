package Collections.List.basico.carrinhodecompra;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private
        List<Item> carrinho = new ArrayList<>();

    public void adicionarItem(String nome, double preço, int quantidade){
        carrinho.add(new Item(nome, preço, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itemsRemocao = new ArrayList<>();
        if (!carrinho.isEmpty()) {
            for(Item i : carrinho){
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itemsRemocao.add(i);
                }
            }
        }
        carrinho.removeAll(itemsRemocao);
    }

    public void calcularValorTotal(){
        Double total = 0d;
        for(Item i : carrinho){
            Double preço = i.getPreço() * i.getQuantidade();
            total += preço;
        }
        System.out.println("O total do carrinho é: " + total.toString());
    }

    public void exibirItems(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Bola", 50, 1);
        carrinho.adicionarItem("Halter", 500, 2);
        carrinho.adicionarItem("Celular", 2500, 1);

        carrinho.exibirItems();
        carrinho.calcularValorTotal();
        carrinho.removerItem("bola");
        carrinho.exibirItems();
    }
}
