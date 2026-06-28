package br.csi.padroes_revisao.prova2.command;

import br.csi.padroes_revisao.prova2.command.infra.Command;

public class PlayMusic implements Command {

    private Device device;

    public PlayMusic(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.tocarMusica();
    }
}
