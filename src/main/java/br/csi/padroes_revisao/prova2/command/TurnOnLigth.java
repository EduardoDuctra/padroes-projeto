package br.csi.padroes_revisao.prova2.command;

import br.csi.padroes_revisao.prova2.command.infra.Command;

public class TurnOnLigth implements Command {

    private Device device;

    public TurnOnLigth(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.ligar();
    }
}
