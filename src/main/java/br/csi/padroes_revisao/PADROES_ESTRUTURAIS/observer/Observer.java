package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer;


import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.observer.infra.Conta;

public interface Observer {
    void atualizar(Conta conta);
}
