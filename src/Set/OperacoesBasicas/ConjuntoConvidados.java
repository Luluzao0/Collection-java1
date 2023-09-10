package Set.OperacoesBasicas;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;

        for(Convidado c: convidadosSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        //System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");


        conjuntoConvidados.adicionarConvidado("Luis", 1234);
        conjuntoConvidados.adicionarConvidado("Guilherme", 1234);
        conjuntoConvidados.adicionarConvidado("Ana", 4321);
        conjuntoConvidados.adicionarConvidado("Roberta", 2134);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");

        //  conjuntoConvidados.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do set de convidados");


        conjuntoConvidados.exibirConvidados();


    }
}

