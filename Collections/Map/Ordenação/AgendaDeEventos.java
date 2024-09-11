package Collections.Map.Ordenação;

import java.util.Map;
import java.util.TreeMap;
import java.util.HashMap;
import java.util.Iterator;
import java.time.LocalDate;

public class AgendaDeEventos {
    private Map<LocalDate, Evento> agenda = new HashMap<>();

    public AgendaDeEventos() {
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        agenda.put(data, new Evento(nome,atracao));
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(agenda);
        System.out.println(eventosTreeMap);
    }

    public void proximoEvento() {
        LocalDate dataAtual = LocalDate.now();  // Data atual do sistema
        LocalDate proximaData = null;  // Variável para armazenar a próxima data
        Evento proximoEvento = null;   // Variável para armazenar o próximo evento
        
        Iterator<Map.Entry<LocalDate, Evento>> i = this.agenda.entrySet().iterator();
        
        while (i.hasNext()) {
            Map.Entry<LocalDate, Evento> entry = i.next();  // Iterando sobre os eventos
            LocalDate dataEvento = entry.getKey();  // Pegando a data do evento
            
            // Se o evento for hoje ou depois de hoje
            if (dataEvento.isEqual(dataAtual) || dataEvento.isAfter(dataAtual)) {
                // Se proximaData for nula (primeira entrada válida) ou a data atual for mais próxima
                if (proximaData == null || dataEvento.isBefore(proximaData)) {
                    proximaData = dataEvento;  // Armazena a data do evento
                    proximoEvento = entry.getValue();  // Armazena o próximo evento
                }
            }
        }
        
        // Se encontrou um evento válido
        if (proximoEvento != null) {
            System.out.println("O próximo evento: " + proximoEvento.getNome() + " acontecerá na data " + proximaData);
        } else {
            // Se não encontrou nenhum evento futuro
            System.out.println("Não há eventos futuros na agenda.");
        }
    }
    

    public static void main(String[] args) {
        AgendaDeEventos agenda = new AgendaDeEventos();

        agenda.adicionarEvento(LocalDate.of(2024, 12, 2), "Aniversário Kauã", "Kauã");
        agenda.adicionarEvento(LocalDate.of(2024, 11, 13), "Aniversário Isabelle", "Isabelle");
        agenda.adicionarEvento(LocalDate.of(2024, 9, 9), "Hoje", "nada");
        agenda.adicionarEvento(LocalDate.now(), "Hoje", "nada");

        agenda.exibirAgenda();
        agenda.proximoEvento();
    }
}

