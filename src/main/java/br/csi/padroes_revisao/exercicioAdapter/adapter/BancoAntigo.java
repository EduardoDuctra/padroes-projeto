package br.csi.padroes_revisao.exercicioAdapter.adapter;

import br.csi.padroes_revisao.exercicioAdapter.infra.Conta;

public interface BancoAntigo {

    boolean removerConta(String codigo);
    void movimentar(String codigo, double valor);
    double verificarSaldo(String codigo);
    String imprimirExtrato(String codigo);
    void transfereEntreContas(String origem, String destino, double valor);
    Conta novaConta(String tipo, double saldoInicial, boolean vip, double limite);
}
