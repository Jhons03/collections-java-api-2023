package Maps;

import java.time.LocalDate;
import java.time.Month;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEvento {
    private Map<LocalDate, Evento> eventos;

    public AgendaEvento() {
        this.eventos = new HashMap<>();
    }
    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        eventos.put(data, evento);
    }

    private void exibirAgenda(){
        //criei um treemap com a hashmap anterior porem agora organizado por ordem
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        System.out.println(eventosTreeMap);
    }

    public void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        //Entry com a key e o value
        if(!eventosTreeMap.isEmpty()) {
            for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
                if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                    proximaData = entry.getKey();
                    proximoEvento = entry.getValue();
                    System.out.println("O proximo evento: " + proximoEvento + " acontecera na data " + proximaData);
                    break;
                }else {
                    System.out.println("Nao tem nenhum evento proximo.");
                }
            }
        }else{
            System.out.println("Não existe eventos cadastrados");
        }
    }

    public static void main(String[] args) {
        AgendaEvento agendaEvento = new AgendaEvento();
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.MAY, 18), "Churrasco", "Mestre Churrasqueiro");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.AUGUST, 25), "Churrasco", "Baconistas");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.JULY, 8), "Show", "Jota Quest");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.OCTOBER, 6), "Show", "Bruno Mars");
        agendaEvento.adicionarEvento(LocalDate.of(2024, Month.MAY, 31), "Feriado", "Corpus Christy");
        agendaEvento.exibirAgenda();
        agendaEvento.obterProximoEvento();



    }
}
