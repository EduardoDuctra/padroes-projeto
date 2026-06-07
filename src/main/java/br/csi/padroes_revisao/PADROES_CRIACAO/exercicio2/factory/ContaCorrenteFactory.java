package br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.factory;

import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.Conta;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.infra.TipoConta;
import br.csi.padroes_revisao.PADROES_CRIACAO.exercicio2.tipoConta.ContaCorrente;

public class ContaCorrenteFactory extends ContaFactory {

    @Override
    public Conta criarConta(String cpf, Double saldo, boolean especial, Double limite) {

        ContaCorrente cc = new ContaCorrente();
        cc.setCpf(cpf);
        cc.setSaldo(saldo);
        cc.setEspecial(especial);
        cc.setLimiteChequeEspecial(limite);
        cc.setTipoConta(TipoConta.CONTA_CORRENTE);

        return cc;
    }
}
