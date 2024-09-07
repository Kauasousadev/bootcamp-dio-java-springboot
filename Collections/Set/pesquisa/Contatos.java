package Collections.Set.pesquisa;

public class Contatos {
    private
        String nome;
        String telefone;

    public Contatos(String nome, String telefone){
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return nome + " " + telefone;
    }
}
