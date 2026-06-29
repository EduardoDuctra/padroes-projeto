package br.csi.padroes_revisao.EstudoProva2.extra.proxy.questao1;

public class RealBankAccount implements BankAccount {

    private double balance;

    public RealBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdraw(double value) {

        if (value <= balance) {
            balance -= value;
            System.out.println("Saque realizado.");
            System.out.println("Saldo: R$ " + balance);
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }
}
