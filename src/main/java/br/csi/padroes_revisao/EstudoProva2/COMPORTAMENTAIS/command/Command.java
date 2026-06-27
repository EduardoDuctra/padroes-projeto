package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * O padrão Command encapsula uma requisição em um objeto, permitindo
 * parametrizar operações, desacoplar o solicitante do executor e oferecer
 * funcionalidades como histórico, desfazer (undo), filas e agendamento de comandos
 */
public interface Command {

    void execute(Connection con) throws SQLException;
}
