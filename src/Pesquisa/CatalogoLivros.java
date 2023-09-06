package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }

        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAno(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAno = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l: livroList){
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAno.add(l);
                }
            }
        }
        return livrosPorIntervaloAno;
    }


    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;

        if (!livroList.isEmpty()){
            for (Livro l: livroList){
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Harry Potter","J. K.",2015);
        catalogoLivros.adicionarLivro("Harry Potter","J. K.",2015);
        catalogoLivros.adicionarLivro("Jack Ryan","Tom Clancy's",1990);
        catalogoLivros.adicionarLivro("Jardim das Aflições","Olavo de Carvalho",2000);
        catalogoLivros.adicionarLivro("O Principe","Maquiavel",1600);


        System.out.println(catalogoLivros.pesquisarPorAutor("Maquiavel"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAno(1600,2015));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Harry Potter"));

    }
}
