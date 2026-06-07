package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.tipoConta;

import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.exercicioAdapter.infra.Conta;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaCorrente extends Conta {

    private double limiteChequeEspecial;
    private boolean especial;

    @Override
    public double getIRPF() {
        return 0;
    }
}
