package Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {


    private List<Pessoa> pessoaList;


    public OrdenacaoPessoa(){this.pessoaList = new ArrayList<>();}

    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }


    public List<Pessoa> ordenadoPorIdade(){
        List<Pessoa> pessoaPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorIdade);
        return pessoaPorIdade;
    }

    public List<Pessoa> ordernarPorAltura(){
        List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoaPorAltura, new ComparatorPorAltura());
        return pessoaPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Luis",20 ,1.68);
        ordenacaoPessoa.adicionarPessoa("Matheus",19 ,1.85);
        ordenacaoPessoa.adicionarPessoa("Roberto",48 ,1.73);
        ordenacaoPessoa.adicionarPessoa("Arthur",16 ,1.74);
        ordenacaoPessoa.adicionarPessoa("Ana",19 ,1.64);
        ordenacaoPessoa.adicionarPessoa("Luis",20 ,1.68);
        ordenacaoPessoa.adicionarPessoa("Matheus",19 ,1.85);
        ordenacaoPessoa.adicionarPessoa("Roberto",48 ,1.73);
        ordenacaoPessoa.adicionarPessoa("Arthur",16 ,1.74);
        ordenacaoPessoa.adicionarPessoa("Ana",19 ,1.64);
        ordenacaoPessoa.adicionarPessoa("Mathaeus",19 ,1.85);
        ordenacaoPessoa.adicionarPessoa("Robaerto",48 ,1.73);
        ordenacaoPessoa.adicionarPessoa("Aarthur",16 ,1.74);
        ordenacaoPessoa.adicionarPessoa("Anaa",19 ,1.64);
        ordenacaoPessoa.adicionarPessoa("Lusis",20 ,1.68);
        ordenacaoPessoa.adicionarPessoa("Madtheus",19 ,1.85);
        ordenacaoPessoa.adicionarPessoa("Rfoberto",48 ,1.73);
        ordenacaoPessoa.adicionarPessoa("Arthurd",16 ,1.74);
        ordenacaoPessoa.adicionarPessoa("Anfa",19 ,1.64);
        ordenacaoPessoa.adicionarPessoa("Luis",20 ,1.68);
        ordenacaoPessoa.adicionarPessoa("Matheus",19 ,1.85);
        ordenacaoPessoa.adicionarPessoa("Roberto",48 ,1.73);
        ordenacaoPessoa.adicionarPessoa("Arthur",16 ,1.74);
        ordenacaoPessoa.adicionarPessoa("Ana",19 ,1.64);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenadoPorIdade());
        System.out.println(ordenacaoPessoa.ordernarPorAltura());

    }

}
