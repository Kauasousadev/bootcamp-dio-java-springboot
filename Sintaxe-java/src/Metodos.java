import java.util.Scanner;
public class Metodos {
    //calculadora
    //métodos static, pertencem a classe, não a uma instância dela
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        float n1;
        float n2;
        String operaçao;

        System.out.println("Digite o primeiro número:");
        n1 = ler.nextFloat();

        System.out.println("Escolha a operação:");
        System.out.println("Soma -> +");
        System.out.println("Subtração -> -");
        System.out.println("Multiplicação -> *");
        System.out.println("Divisão -> /");
        operaçao = ler.next();

        System.out.println("Digite o segundo número:");
        n2 = ler.nextFloat();

        switch (operaçao) {
            case "+":
                System.out.println("Resultado: "+ somar(n1,n2));
                break;
            case "-":
                System.out.println("Resultado: "+ subtrair(n1,n2));
                break;
            case "*":
                System.out.println("Resultado: "+ multiplicar(n1,n2));
                break;
            case "/":
                System.out.println("Resultado: "+ dividir(n1,n2));
                break;
        
            default:
            System.out.println("Operação inválida");
                break;
        }
        ler.close();
    }

    static float somar(float n1, float n2){
        float resultado = n1 + n2;
        return resultado;
    }

    static float subtrair(float n1, float n2){
        float resultado = n1 - n2;
        return resultado;
    }
    
    static float multiplicar(float n1, float n2){
        float resultado = n1 * n2;
        return resultado;
    }
    
    static float dividir(float n1, float n2) throws Exception{
        float resultado = n1 / n2;
        return resultado;
    }
}

