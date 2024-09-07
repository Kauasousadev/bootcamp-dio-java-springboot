package Collections.Set.pesquisa;

import java.util.*;

public class ListaDeContatos {
    private
        Set<Contatos> contatosSet;

    public ListaDeContatos(){
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, String telefone){
        contatosSet.add(new Contatos(nome, telefone));
    }

    public void exibirContatos(){
        System.out.println(contatosSet);
    }

    public Set<Contatos> pesquisarContatos(String nome){
        Set<Contatos> pesquisa = new HashSet<>();
        for(Contatos c : contatosSet){
            if (c.getNome().startsWith(nome)) {
                pesquisa.add(c);
            }
        }
        return pesquisa;
    }

    public Contatos atualizarNumeroContato(String nome, String novoNumero){
        Contatos contatoAtualizado = null;
        for(Contatos c : contatosSet){
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setTelefone(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }
    public static void main(String[] args) {
        ListaDeContatos contatos = new ListaDeContatos();

        contatos.adicionarContato("Kauã", "12345");
        contatos.adicionarContato("Lorena", "23456");
        contatos.adicionarContato("Ronaldo", "34567");
        contatos.adicionarContato("Julia", "45678");

        contatos.exibirContatos();

        contatos.atualizarNumeroContato("Kauã", "00000");
        contatos.exibirContatos();

        System.out.println(contatos.pesquisarContatos("Kauã"));
    }
}
