package Collections.Set.basico;

public class Convidado {
    private
        String nome;
        int convite;

    public Convidado(String nome, int convite){
        this.nome = nome;
        this.convite = convite;
    }
    public int getConvite() {
        return convite;
    }

    public void setConvite(int convite) {
        this.convite = convite;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Convidado convidado)) return false;
        return getConvite() == convidado.getConvite();
    }

    @Override
    public String toString() {
        return "Convidado " + nome + " ,convite " + convite;
    }
}
