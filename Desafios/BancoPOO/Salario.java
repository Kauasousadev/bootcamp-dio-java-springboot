package Desafios.BancoPOO;

//Salário só pode receber depósito 1 vez
public class Salario extends Conta{
    private
        int qtdDepositos = 1;

    public Salario(Cliente portador, String codigo, Double saldo){
        super(portador, codigo, saldo);
    }

    @Override
    public boolean depositar(Double valorDeposito){
        if (qtdDepositos < 1) {
            System.out.println("Quantidade de depósitos excedida.");
            return false;
        }else{
            if (super.depositar(valorDeposito)) {
                qtdDepositos--;
                return true;
            }
        }
        return false;
    }
}
