package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.Command;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.DAOCallback;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlteraCommand implements Command {

    private Conta conta;
    private DAOCallback callback;

    public AlteraCommand(Conta conta, DAOCallback callback) {
        this.conta = conta;
        this.callback = callback;
    }



    @Override
    public void execute(Connection con) throws SQLException {

        PreparedStatement stmt = con.prepareStatement(
                "UPDATE conta SET saldo = ? WHERE id = ?");

        stmt.setDouble(1, conta.getSaldo());
        stmt.setLong(2, conta.getNumeroConta());

        int i = stmt.executeUpdate();
        callback.callback(i);

    }
}
