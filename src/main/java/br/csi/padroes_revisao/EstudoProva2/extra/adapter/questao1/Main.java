package br.csi.padroes_revisao.EstudoProva2.extra.adapter.questao1;

public class Main {
    public static void main(String[] args) {

        PaymentProcessor pagamento = new PaymentAdapter(new OldBankSystem());

        pagamento.pay(50);
        pagamento.pay(120.75);
        pagamento.pay(999);

    }
}
