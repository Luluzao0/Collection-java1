package Set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set pesquisarPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c: contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c: contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();


        //agendaContatos.exibirContato();

        agendaContatos.adicionarContato("LUIS G",89207345);
        agendaContatos.adicionarContato("LUIS",782374884);
        agendaContatos.adicionarContato("LUIS GUILHERME",54370298);
        agendaContatos.adicionarContato("ANA",1234567889);
        agendaContatos.adicionarContato("MARIA",98765421);
        agendaContatos.adicionarContato("JOSEFINA",96341963);

        agendaContatos.exibirContato();
        agendaContatos.exibirContato();
        System.out.println(agendaContatos.pesquisarPorNome("LUIS"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("LUIS",378912673));


    }
}
