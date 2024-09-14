package Desafios.BancoPOO;

//Universitária só pode receber deposito de no máximo 200 reais
public class Universitaria extends Conta{
    private
        Double limiteDeposito = 350D;

    public Universitaria(Cliente portador, String codigo, Double saldo){
        super(portador, codigo, saldo);
    }

    @Override
    public boolean depositar(Double valorDeposito){
        if (limiteDeposito < valorDeposito) {
            System.out.println("Valor de depósito excedido, você pode depositar: " + limiteDeposito);
            return false;
        }else{
            if (super.depositar(valorDeposito)) {
                limiteDeposito -= valorDeposito;
                return true;
            }
        }
        return false;
    }
}
