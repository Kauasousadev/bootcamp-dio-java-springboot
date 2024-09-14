package Desafios.BancoPOO;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Banco {
    private
        Map<String, Conta> contas;
        Set<Cliente> clientes;
        Conta usuario;
        Boolean online = true;
        Boolean appAberto = true;

    public Banco(){
        this.contas = new HashMap<>();
        this.clientes = new HashSet<>();
    }

    public void login(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Frank Bank");
        System.out.println("1 - Já sou cliente");
        System.out.println("2 - Criar conta");
        System.out.println("3 - Fechar banco");
        System.out.println("Escolha uma opção: ");

        switch (ler.nextInt()) {
            case 1:
                //Se na primeira iteração do programa, cair esse caso, dá erro
                //Futura implementação: Sistema de login, salvo o cliente em arquivo junto com sua senha encriptada, e ao fazer login é feito a busca da sua conta.
                break;
            case 2:
                online = true;
                criarConta(criarCliente());
                operacoesDaConta();
                break;
            case 3:
                appAberto = false;
                online = false;
                break;
        }
    }

    public String criarCliente(){
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem vindo ao Frank Bank");
        System.out.println("Cadastro de cliente");
        System.out.println("Nome do portador da conta: ");
        String nome = ler.nextLine();
        System.out.println("CPF do portador da conta: ");
        String cpf = ler.nextLine();
        System.out.println("Email do portador da conta: ");
        String email = ler.nextLine();
        clientes.add(new Cliente(nome, cpf, email));
        return nome;
    }

    public void criarConta(String nome){
        Scanner ler = new Scanner(System.in);
        System.out.println("Criando conta");
        System.out.println("Código da conta: ");
        String codigo = ler.nextLine();
        System.out.println("Tipo da conta:");
        System.out.println("1 - Corrente");
        System.out.println("2 - Poupança");
        System.out.println("3 - Universitária");
        System.out.println("4 - Salário");
        System.out.println("Escolha o tipo da conta: ");
        int tipoConta = ler.nextInt();
        switch (tipoConta) {
            case 1:
            usuario = new Conta(pesquisarClientes(nome), codigo, 0D);
                break;
            case 2:
            usuario = new Poupanca(pesquisarClientes(nome), codigo, 0D);
                break;
            case 3:
            usuario = new Universitaria(pesquisarClientes(nome), codigo, 0D);
                break;
            case 4:
            usuario = new Salario(pesquisarClientes(nome), codigo, 0D);
                break;
        }
        contas.put(codigo, usuario);
    }

    public Cliente pesquisarClientes(String nome){
        Cliente cliente = null;
        for(Cliente c : clientes){
            if (c.getNome().startsWith(nome)) {
                cliente = c;
                break;
            }
        }
        return cliente;
    }

    public void operacoesDaConta(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Bem vindo ao Frank Bank");
        System.out.println("1 - Mostrar informações");
        System.out.println("2 - Deposito");
        System.out.println("3 - Saque");
        System.out.println("4 - Transferência(em manutenção)");
        System.out.println("4 - Log out");
        System.out.println("6 - Fechar banco");
        System.out.println("Escolha uma opção: ");
        switch (ler.nextInt()) {
            case 1:
                System.out.println(usuario);
                System.out.println(usuario.getPortador());
                break;
            case 2:
                System.out.println("Digite o valor do depósito: ");
                Double valorDeposito = ler.nextDouble();
                usuario.depositar(valorDeposito);
                break;
            case 3:
                System.out.println("Digite o valor do saque: ");
                Double valorSaque = ler.nextDouble();
                usuario.sacar(valorSaque);
                break;
            case 5:
                System.out.println("Log-out feito");
                online = false; 
                break;
            //*case 4:
             //   System.out.println("Digite o valor da transferência: ");
             //   Double valorTransferência = ler.nextDouble();
            //    System.out.println("Digite a conta da transferência: ");
           //    String contaTransferencia = ler.nextLine();            
            case 6:
                System.out.println("Aplicativo fechado");
                online = false; 
                appAberto = false; 
                break;
        }
    }

    public static void main(String[] args) {
        Banco FrankBank = new Banco();
        FrankBank.login();
        while (FrankBank.appAberto == true) {
            if (FrankBank.online == true) {
                FrankBank.operacoesDaConta();
            }else{
                FrankBank.login();
            }
        }

    }
}