package br.csi.padroes_revisao.prova2.command;

import br.csi.padroes_revisao.prova2.command.infra.Command;

public class OpenDoor implements Command {

    private Device device;

    public OpenDoor(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.abrir();
    }
}
