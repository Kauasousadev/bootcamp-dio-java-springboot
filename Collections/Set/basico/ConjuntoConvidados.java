package Collections.Set.basico;

import java.util.*;

public class ConjuntoConvidados {
    Set<Convidado> convidadosSet;

    public ConjuntoConvidados(){
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int convite){
        convidadosSet.add(new Convidado(nome, convite));
    }

    public void removerConvidado(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadosSet){
            if (c.getConvite() == codigoConvite) {
                convidadoParaRemover = c;
                convidadosSet.remove(convidadoParaRemover);
                break;
            }
        }
    }

    public int contarConvidados(){
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados convidadoss = new ConjuntoConvidados();

        convidadoss.adicionarConvidado("Kauã", 19);
        convidadoss.adicionarConvidado("Julia", 20);
        convidadoss.adicionarConvidado("Lorena", 22);
        convidadoss.adicionarConvidado("Ronaldo", 22);

        convidadoss.exibirConvidados();
        convidadoss.removerConvidado(21);
        convidadoss.exibirConvidados();
        System.out.println(convidadoss.contarConvidados());
    }
}
