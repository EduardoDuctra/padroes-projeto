package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.Command;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.DAOCallback;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExcluiCommand implements Command {

    private Long numero;
    private DAOCallback callback;

    public ExcluiCommand(Long numero, DAOCallback callback) {
        this.numero = numero;
        this.callback = callback;
    }

    @Override
    public void execute(Connection con) throws SQLException {

        PreparedStatement stmt = con.prepareStatement(
                "DELETE FROM conya WHERE id = ?");


        stmt.setLong(1, numero);

        int i = stmt.executeUpdate();
        callback.callback(i);
    }
}
