package Desafios.BancoPOO; 

public class Conta {
    private
        Double saldo;
        String codigoDaConta;
        Cliente portador;

    public Conta(Cliente portador, String codigo, Double saldo){
        this.portador = portador;
        this.codigoDaConta = codigo;
        this.saldo = saldo;
    }
    
    public void consultarSaldo(){
        System.out.println(this.getSaldo());
    }

    public void depositar(Double valorDeposito){
        if (valorDeposito <= 0) {
            System.out.println("Valor inválido! Valor do depósito precisa ser maior que zero.");
        }else{
            saldo += valorDeposito;
            System.out.println("Deposito efetuado com sucesso, novo saldo de: " + saldo);
        }

    }

    public void transferir(Double valorTransferencia, Conta conta){
        if (valorTransferencia < 0 && valorTransferencia > saldo) {
            System.out.println("Valor de transferência inválido!");
        }
        if (conta == null) {
            System.out.println("Conta inexistente");
        }
        this.saldo -= valorTransferencia;
        conta.saldo += valorTransferencia;
        System.out.println("Transferência efetuada com sucesso, novo saldo de: " + saldo);
    }

    public boolean sacar(Double valorSaque){
        if (valorSaque <= 0 || valorSaque > saldo) {
            System.out.println("Valor de saque inválido.");
            return false;
        }else{
            saldo -= valorSaque;
            System.out.println("Saque efetuado com sucesso, novo saldo de: " + saldo);
            return true;
        }
    }

    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
    public Cliente getPortador() {
        return portador;
    }
    @Override
    public String toString() {
        return "Dados do cliente \n Saldo: " + saldo + "\nCodigo da conta: " + codigoDaConta;
    }
}