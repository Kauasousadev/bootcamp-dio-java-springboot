package Collections.List.basico.listadetarefa;

public class Tarefa {
    private
        String descricao;
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public String getDescricao() {
        return descricao;
    }

    public Tarefa(String descricao){
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }
}
