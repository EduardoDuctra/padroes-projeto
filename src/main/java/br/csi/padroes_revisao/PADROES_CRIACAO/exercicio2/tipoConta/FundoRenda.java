package br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.tipoConta;

import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Conta;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Movimentacao;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.TipoConta;

public class FundoRenda extends Conta {

    private TipoConta tipoConta;

    public FundoRenda(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }


    @Override
    public double getIRPF() {
        double impoto = 0;

        for(Movimentacao movimentacao : getMovimentacoes()) {
            impoto += movimentacao.getValor()*0.275;
        }

        return impoto;
    }
}
