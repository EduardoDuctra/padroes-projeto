package br.csi.padroes_revisao.EstudoProva2.extra.adapter.questao1;

public class PaymentAdapter implements PaymentProcessor{

    private OldBankSystem oldBankSystem;

    public PaymentAdapter(OldBankSystem oldBankSystem) {
        this.oldBankSystem = oldBankSystem;
    }

    @Override
    public void pay(double value) {
        oldBankSystem.makeTransaction(value);
    }
}
