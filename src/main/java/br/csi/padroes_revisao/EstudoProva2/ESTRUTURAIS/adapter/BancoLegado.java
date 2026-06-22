package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.adapter;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.TipoConta;

public interface BancoLegado {

    boolean removerConta(String codigo);
    void movimentar(String codigo, double valor);
    double verificarSaldo(String codigo);
    String imprimirExtrato(String codigo);
    void transfereEntreContas(String origem, String destino, double valor);

}
