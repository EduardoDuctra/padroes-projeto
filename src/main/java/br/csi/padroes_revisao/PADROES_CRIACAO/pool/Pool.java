package br.csi.padroes_revisao.PADROES_CRIACAO.pool;

public interface Pool <K>{

    K acquire();
    void release(K t);
}
