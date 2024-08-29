import java.util.Scanner;

public class Condicionais {
    public static void main(String[] args) {
        //Condicional if
        Scanner ler = new Scanner(System.in);
        String nome = "Kaua";

        if(nome == "Kaua"){
            System.out.println("Nome lindo!");
        }else if(nome == "Ronaldo") {
            System.out.println("maneirinho");
        } else {
            System.out.println("Quem?");
        }
    }
}
