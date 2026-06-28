package br.csi.padroes_revisao.prova2.command;

import br.csi.padroes_revisao.prova2.command.infra.Command;
import br.csi.padroes_revisao.prova2.command.infra.Routine;


/**
 * Exatamente. O Command encapsula uma solicitação (ação) dentro de um objeto.
 * Em vez de alguém chamar diretamente um método do dispositivo, ele chama o método execute()
 * do comando, que por sua vez executa a ação no dispositivo.
 *
 *
 * Device → sabe como fazer uma ação.
 * Command → sabe qual ação pedir ao Device.
 * Routine → sabe quais comandos executar e em que ordem.
 *
 */
public class Main {
    public static void main(String[] args) {

        Device luzSala = new Device("Luz da sala");
        Device porta = new Device("Porta principal");
        Device som = new Device("Sistema de som");
        Device seguranca = new Device("Alarme");

        Command ligarLuz = new TurnOnLigth(luzSala);
        Command abrirPorta = new OpenDoor(porta);
        Command tocarMusica = new PlayMusic(som);
        Command iniciarSeguranca = new StartSecurity(seguranca);


        Routine chegarEmCasa = new Routine("Chegar em casa");
        chegarEmCasa.addComando(ligarLuz);
        chegarEmCasa.addComando(abrirPorta);
        chegarEmCasa.addComando(tocarMusica);


        Routine sairCasa = new Routine("Sair de casa");
        sairCasa.addComando(iniciarSeguranca);

        chegarEmCasa.executarRotina();
    }
}
