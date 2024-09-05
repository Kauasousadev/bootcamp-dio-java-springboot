import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia;
        String nomeCliente;
        float saldo;

        Scanner ler = new Scanner(System.in);

        System.out.println("Seja bem-vindo ao nosso banco!");
        System.out.println("Digite o nome do portador da conta:");
        nomeCliente = ler.nextLine();
        System.out.println("Digite a agência da conta:");
        agencia = ler.next();
        System.out.println("Digite o número da conta:");
        numero = ler.nextInt();
        System.out.println("Digite o saldo inicial da conta:");
        saldo =  ler.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", o número da sua conta é " + numero + ", e seu saldo de R$" + saldo + " já está disponível!");
        ler.close();
    }
}
