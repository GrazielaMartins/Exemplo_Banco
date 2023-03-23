public class Conta {
   private int conta;
   private double saldo;

    public Conta(int conta, double saldo) {
        this.conta = conta;
        this.saldo = saldo;
    }

    public int getConta() {
        return conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor<=saldo)
        saldo=saldo - valor;
    }

    public void depositar(double valor){
        saldo=saldo+valor;
    }
}
