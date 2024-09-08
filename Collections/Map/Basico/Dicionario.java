package Collections.Map.Basico;

import java.util.Map;
import java.util.HashMap;

public class Dicionario {
    private
        Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        dicionario.remove(palavra);
    }

    public void exibirPalavras(){
        System.out.println(dicionario);
    }

    public String pesquisarPorPalavra(String palavra){
        String pesquisa = dicionario.get(palavra);
        return pesquisa;
    }
    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Bola", "Esfera");
        dicionario.adicionarPalavra("Quadrado", "Polígono quadrilatero onde todos os lados tem a mesma medida.");
        dicionario.adicionarPalavra("Triângulo", "Polígono de 3 lados.");

        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Bola"));
    }
}
