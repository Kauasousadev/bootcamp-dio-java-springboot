package Collections.List.pesquisa.catalogolivros;

public class Livro {
    private
        String titulo;
        String autor;
        int anodepublicacao;

    public Livro(String titulo, String autor, int anodepublicacao){
        this.titulo = titulo;
        this.anodepublicacao = anodepublicacao;
        this.autor = autor;
    }

    public void setAnodepublicacao(int anodepublicacao) {
        this.anodepublicacao = anodepublicacao;
    }
    public int getAnodepublicacao() {
        return anodepublicacao;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getAutor() {
        return autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return titulo + autor + anodepublicacao;
    }
}
