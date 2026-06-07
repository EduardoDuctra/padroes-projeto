package br.csi.padroes_revisao.PADROES_CRIACAO.builder.interfaces;

public interface Builder {

    void prepararMassa();
    void colocarMolhoTomate();
    void colocarQueijo();
    void colocarCalabresa();
    void colocarMilho();
    void assar();

    Lanche build();
}
