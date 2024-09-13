package Desafios.BancoPOO;

//Poupança só pode sacar 200 reais
public class Poupanca extends Conta{
    private
        int limiteSaque = 200;

    public Poupanca(Cliente portador, String codigo, Double saldo){
        super(portador, codigo, saldo);
    }

    @Override
    public boolean sacar(Double valorSaque){
        if (limiteSaque < valorSaque) {
            System.out.println("Limite de saque insuficiente, você ainda pode sacar: " + limiteSaque);
            return false;
        }else{
            if (super.sacar(valorSaque)){
                this.limiteSaque -= valorSaque;
                return true;
            }
        }
    return false;
    }
}
