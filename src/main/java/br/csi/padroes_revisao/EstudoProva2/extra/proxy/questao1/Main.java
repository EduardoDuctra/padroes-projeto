package br.csi.padroes_revisao.EstudoProva2.extra.proxy.questao1;

public class Main {

    public static void main(String[] args) {

        BankAccount conta1 = new BankAccountProxy(new RealBankAccount(1000), "1234");

        conta1.withdraw(200);

        System.out.println();

        BankAccount conta2 = new BankAccountProxy(new RealBankAccount(1000), "9999");

        conta2.withdraw(200);

    }

}