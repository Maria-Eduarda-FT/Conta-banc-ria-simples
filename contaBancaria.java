public class contaBancaria {
    private String titular;
    private double saldo;
    private int numeroConta;

    public contaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("Valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para o saque.");
        } else {
            System.out.println("Valor de saque deve ser positivo.");
        }
    }

    //informações da conta
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$\n" + saldo);
    }


    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
}