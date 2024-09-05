package Collections.catalogolivros;

import java.util.List;
import java.util.ArrayList;

public class CatalogoLivros {
    private 
        List<Livro> catalogo;

    public CatalogoLivros(){
        this.catalogo = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anodepublicacao){
        catalogo.add(new Livro( titulo, autor, anodepublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for(Livro l : catalogo){
                if(l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if (!catalogo.isEmpty()) {
            for(Livro l : catalogo){
                if (l.getAnodepublicacao() >= anoFinal && l.getAnodepublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livroPorTitulo = null;
        if (!catalogo.isEmpty()) {
            for(Livro l : catalogo){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Kamasutra", "Livinho", 2018);
        catalogoLivros.adicionarLivro("Codigo limpo", "PrimoDev", 1998);

        System.out.println(catalogoLivros.pesquisarPorAutor("Livinho"));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Codigo limpo"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2018));
    }
}
