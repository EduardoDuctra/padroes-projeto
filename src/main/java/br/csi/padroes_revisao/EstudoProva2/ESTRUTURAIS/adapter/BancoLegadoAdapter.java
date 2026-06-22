package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.adapter;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.decorator.BancoInterface;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.BancoException;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.Conta;
import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.TipoConta;


/**
 * Ele atua como um tradutor entre uma interface que o cliente espera e uma interface diferente que já existe.
 *
 * A ideia é:
 *
 * "Tenho uma classe pronta, mas sua interface não é compatível com o que meu sistema espera."
 */
public class BancoLegadoAdapter implements BancoLegado{

    private BancoInterface banco;

    @Override
    public boolean removerConta(String codigo) {
        try {
            banco.excluirConta(Long.valueOf(codigo));
            return true;
        } catch (BancoException e) {
            return false;
        }
    }

    @Override
    public void movimentar(String codigo, double valor) {
        if (valor < 0) {
            try {
                banco.saque(Long.valueOf(codigo), Math.abs(valor));
            } catch (BancoException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                banco.deposito(Long.valueOf(codigo), valor);
            } catch (BancoException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public double verificarSaldo(String codigo) {
        try {
            return banco.getSaldo(Long.valueOf(codigo));
        } catch (BancoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String imprimirExtrato(String codigo) {
        try {
            return banco.extrato(Long.valueOf(codigo));
        } catch (BancoException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void transfereEntreContas(String origem, String destino, double valor) {
        try {
            banco.transferencia(Long.valueOf(origem), Long.valueOf(destino), valor);
        } catch (BancoException e) {
            throw new RuntimeException(e);
        }
    }



}
