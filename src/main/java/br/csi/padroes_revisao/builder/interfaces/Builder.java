package br.csi.padroes_revisao.builder.interfaces;

public interface Builder {

    void prepararMassa();
    void colocarMolhoTomate();
    void colocarQueijo();
    void colocarCalabresa();
    void colocarMilho();
    void assar();

    Lanche build();
}
