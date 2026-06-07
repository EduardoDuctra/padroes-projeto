package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Collection;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Data
public abstract class Conta {

    @EqualsAndHashCode.Include
    private Long numeroConta;
    private double saldo;
    private String cpf;
    private Collection<Movimentacao>movimentacoes;
    private TipoConta tipoConta;

    public abstract double getIRPF ();



}
