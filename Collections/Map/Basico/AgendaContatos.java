package Collections.Map.Basico;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }
    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.adicionarContato("Kauã", 12345);
        agenda.adicionarContato("Lorena", 23456);
        agenda.adicionarContato("Ronaldo", 34567);
        agenda.adicionarContato("Julia", 45678);

        agenda.exibirContatos();
        System.out.println(agenda.pesquisarPorNome("Kauã"));
        agenda.removerContato("Lorena");
        agenda.exibirContatos();
    }
}
