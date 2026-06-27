package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.CoR;

import lombok.Data;

@Data
public abstract class Autorizador {

    private Autorizador proximoAutorizador;

    public Autorizador(Autorizador proximoAutorizador) {
        this.proximoAutorizador = proximoAutorizador;
    }

    public abstract boolean autoriza(Reembolso reembolso);
}
