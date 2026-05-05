package br.csi.padroes_revisao.pool;

public interface Pool <K>{

    K acquire();
    void release(K t);
}
