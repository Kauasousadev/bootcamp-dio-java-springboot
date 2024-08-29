package Desafios.ProcessoSeletivo;
import java.util.concurrent.ThreadLocalRandom;
import java.util.Arrays;

public class ProcessoSeletivo {
    static float baseSalarial = 2000;
    static String [] candidatacoes = new String[5];
    public static void main(String[] args) {
        candidatacoes = selecionarCandidatos();
        contatarCandidatos(candidatacoes);
    }

    static void contatarCandidatos(String[] candidatos){
        for(int i = 0; i < candidatos.length ; i++){//iteração array
            boolean atendeu = false;
            if (candidatos[i] !=null) {
                for(int j = 1; j <= 3 ; j++){ //tentativas
                    if (ThreadLocalRandom.current().nextInt(1, 3) == 1) {
                        System.out.println("Conseguimos contato com o(a) candidato(a) " + candidatos[i] + " após " + j + " tentativa(s)");
                        atendeu = true;
                        break;
                    }
                }
                if (!atendeu) {
                    System.out.println("Não conseguimos contato com o(a) candidato(a) " + candidatos[i]);
                    continue;
                }
            }
        }
    }

    static String[] selecionarCandidatos(){
        String [] candidatos = {"Kauã","Lorena", "Julia", "Enzo", "Ronaldo", "Bellquis", "Isabelle", "Isadora", "Edivani", "Letícia"};
        String [] candidatosSelecionados = new String[5];
        int qtdCandidatosSelecionados = 0;
        int iteracaoArray = 0;

        for(int i = 0; i < candidatos.length; i++){
            if (qtdCandidatosSelecionados < 5) {
                if (analisarCandidato(valorPretendido()) == false) {
                    continue;
                }else{
                    candidatosSelecionados[iteracaoArray] = candidatos[i];
                    qtdCandidatosSelecionados = qtdCandidatosSelecionados + 1;
                    iteracaoArray++;
                }
            }else{
                break;
            }
        }
        System.out.println("Os candidatos selecionados foram: " + Arrays.toString(candidatosSelecionados));
        return candidatosSelecionados;
    }

    static boolean analisarCandidato(double propostaCandidato){
        if(propostaCandidato < baseSalarial){
            return true;
        }else if(propostaCandidato == baseSalarial){
            return true;
        }else{
            return false;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
