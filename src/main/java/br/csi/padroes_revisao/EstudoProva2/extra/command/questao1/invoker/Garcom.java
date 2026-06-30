package br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.invoker;

import br.csi.padroes_revisao.EstudoProva2.extra.command.questao1.infra.Command;

public class Garcom {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    //O garçom não sabe fazer pizza nem hambúrguer.
    // Ele apenas executa o comando recebido.
    public void enviarPedido(){
        command.execute();
    }
}
