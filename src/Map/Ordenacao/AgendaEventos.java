package Map.Ordenacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;


    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        Evento evento = new Evento(nome, atracao);
        eventosMap.put(data, evento);
    }

    public void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    public void obterProximoEvento(){
        /*Set<LocalDate> dateSet = eventosMap.keySet();
        Collection<Evento> values = eventosMap.values();*/

        //eventosMap.get();


        LocalDate dataAtual  = LocalDate.now();

        LocalDate proximaData = null;
        Evento proximoEvento = null;

        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet() ){
            proximaData = entry.getKey();
            proximoEvento = entry.getValue();
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O PROXIMO EVENTO: " + proximoEvento + " acontecerá na data " + proximaData);
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.JULY,15),"Evento 1", "Luisao");
        agendaEventos.adicionarEvento(LocalDate.of(2020, 7,16),"Evento 2", "Guilherme");
        agendaEventos.adicionarEvento(LocalDate.of(2022, Month.OCTOBER,20),"Evento 3", "Gui");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.SEPTEMBER,11),"Evento 3", "Gui");



        agendaEventos.exibirAgenda();
        agendaEventos.obterProximoEvento();

    }
}
