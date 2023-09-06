package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }


    public void AdicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasPremover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasPremover.add(t);
            }
        }
        tarefaList.removeAll(tarefasPremover);
    }


    public int obterNumeroTotal(){
        return tarefaList.size(); // qtd de elementos nessa lista
    }


    public void ObterDescricoesTarefas(){
        System.out.println(tarefaList);
    }


    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        listaTarefa.AdicionarTarefa("Tarefa 1");
        listaTarefa.AdicionarTarefa("Tarefa 2");
        System.out.println("o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotal());


        listaTarefa.removerTarefa("Tarefa 2");
        System.out.println("o numero total de elementos na lista é: " + listaTarefa.obterNumeroTotal());


        listaTarefa.ObterDescricoesTarefas();
    }
}
