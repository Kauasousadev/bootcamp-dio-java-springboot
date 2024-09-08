package Collections.Map.Ordenação;

public class Evento {
    private
        String nome;
        String atracao;

    public Evento(String nome, String atracao){
        this.nome = nome;
        this.atracao = atracao;
    }
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome + " " + atracao;
    }
}
