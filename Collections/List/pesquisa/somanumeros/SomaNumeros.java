package Collections.List.pesquisa.somanumeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class SomaNumeros {
    private
        List<Integer> listaNumeros = new ArrayList<>();

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public void calcularSoma(){
        int soma = 0;
        if (!listaNumeros.isEmpty()) {
            for(Integer i : listaNumeros){
                soma += i;
            }
        }
        System.out.println("A soma dos elementos da lista é: "+ soma);
    }

    public void encontrarMaiorNumero(){
        int maior = 0;
        if (!listaNumeros.isEmpty()) {
            Iterator<Integer> var2 = this.listaNumeros.iterator();
            while(var2.hasNext()) {
                Integer numero = (Integer)var2.next();
                if (numero >= maior) {
               maior = numero;
                }
            }
        }
        System.out.println("O maior elemento da lista é: "+ maior);
    }

    public void encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if (!listaNumeros.isEmpty()) {
            Iterator<Integer> var2 = this.listaNumeros.iterator();
            while(var2.hasNext()) {
                Integer numero = (Integer)var2.next();
                if (numero <= menor) {
               menor = numero;
                }
            }
        }
        System.out.println("O menor elemento da lista é: "+ menor);
    }

    public void exibirNumeros(){
        System.out.println(listaNumeros);
    }

    public static void main(String[] args) {
        SomaNumeros listNumeros = new SomaNumeros();

        listNumeros.adicionarNumero(13);
        listNumeros.adicionarNumero(16);
        listNumeros.adicionarNumero(10);
        listNumeros.adicionarNumero(5);

        listNumeros.encontrarMaiorNumero();
        listNumeros.encontrarMenorNumero();
    }
}
