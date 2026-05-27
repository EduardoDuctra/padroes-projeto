package br.csi.padroes_revisao.exercicioDecorator.decorator;

import br.csi.padroes_revisao.exercicioDecorator.infra.Conta;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

/**
 * O padrão Decorator serve para adicionar funcionalidades extras a
 * um objeto sem modificar sua classe original
 *
 * Ele cria uma classe “envolvendo” outra
 */
public abstract class ContaDecorator extends Conta {

    protected Conta conta;

    public ContaDecorator(Conta conta) {
        this.conta = conta;
    }


    //cria o arquivo de logs se não existir
    //se existir complementa o existente
    protected void gerarLogs(String mensagem) {

        try {
            FileWriter writer = new FileWriter("log.txt", true);
            writer.write(LocalDateTime.now() + " - " + mensagem + "\n\n");

            writer.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public double getIRPF() {
        gerarLogs("Método getIRPF chamado");
        return conta.getIRPF();
    }
}
