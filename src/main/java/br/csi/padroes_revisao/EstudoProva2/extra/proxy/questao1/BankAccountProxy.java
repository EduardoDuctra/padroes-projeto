package br.csi.padroes_revisao.EstudoProva2.extra.proxy.questao1;

public class BankAccountProxy implements BankAccount{

    private RealBankAccount realBankAccount;
    private String password;

    public BankAccountProxy(RealBankAccount realBankAccount, String password) {
        this.realBankAccount = realBankAccount;
        this.password = password;
    }

    @Override
    public void withdraw(double value) {

        if (password.equals("1234")) {
            realBankAccount.withdraw(value);
        } else {
            System.out.println("Senha incorreta.");
        }

    }
}
