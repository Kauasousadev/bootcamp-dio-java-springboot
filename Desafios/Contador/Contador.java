package Desafios.Contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Digite o primeiro parâmetro: ");
        numero1 = ler.nextInt();
        System.out.println("Digite o segundo parâmetro: ");
        numero2= ler.nextInt();

        try {
            contador(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            e.printStackTrace();
        }
    }

    static void contador(int num1, int num2) throws ParametrosInvalidosException{
        int contagem = num2 - num1;
        if (num2 > num1) {
            for(int i = 0; i <= contagem; i++){
                System.out.println("Imprimindo o número: "+i);
            }
        }else{
            throw new ParametrosInvalidosException();
        }
    }
}
