package Map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
            Integer numeroPorNome = null;

        if(!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luis", 1232345612);
        agendaContatos.adicionarContato("Guilherme", 8582863);
        agendaContatos.adicionarContato("Gui", 234565);
        agendaContatos.adicionarContato("Lulu", 578863);
        agendaContatos.adicionarContato("Lui", 345667);
        agendaContatos.adicionarContato("Genove", 365789254);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Genove");
        agendaContatos.exibirContatos();

        System.out.println("o numero é: " + agendaContatos.pesquisarPorNome("Lulu"));



    }
}
