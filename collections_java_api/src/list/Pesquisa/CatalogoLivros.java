package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livroList;

 public CatalogoLivros(){

        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getautor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }

        }

        return livrosPorAutor;

    }


    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livroList.isEmpty()){
            for(Livro l:livroList){
                if(l.getanoPublicacao() >= anoInicial && l.getanoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }

        }

        return livrosPorIntervaloAnos;
    }


    public Livro pesquisarPorTitulo(String Titulo){

        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){
            
            for(Livro l:livroList){
                if(l.getTitulo().equalsIgnoreCase(Titulo)){
                    livroPorTitulo = l;
                    break;
                } 
            }
                  
        
        }

        return livroPorTitulo;
    }

}
