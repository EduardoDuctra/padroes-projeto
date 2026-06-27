package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.Command;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.DAOCallback;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsereCommand implements Command {

    private Conta conta;
    private DAOCallback callback;

    public InsereCommand(Conta conta, DAOCallback callback) {
        this.conta = conta;
        this.callback = callback;
    }

    @Override
    public void execute(Connection con) throws SQLException {

        PreparedStatement stmt =
                con.prepareStatement("insert into conta_bancaria (id, cpf, saldo) values (?, ?, ?)");


        stmt.setLong(1, conta.getNumeroConta());
        stmt.setString(2, conta.getCpf());
        stmt.setDouble(3, conta.getSaldo());
        int i = stmt.executeUpdate();
        callback.callback(i);

    }
}
