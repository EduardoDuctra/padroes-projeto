package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.Command;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.DAOCallback;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;
import br.csi.padroes_revisao.REVISAO.exercicio2.tipoConta.ContaCorrente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SelecionaCommand implements Command {

    private Long numero;
    private DAOCallback callback;

    public SelecionaCommand(Long numero, DAOCallback callback) {
        this.numero = numero;
        this.callback = callback;
    }

    @Override
    public void execute(Connection con) throws SQLException {

        PreparedStatement stmt =
                con.prepareStatement("select * from conta where numero = ?");

        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            String saldo = rs.getString("saldo");
            String cpf = rs.getString("cpf");

            Conta conta = new ContaCorrente(0.0, false);
            conta.setSaldo(Double.parseDouble(saldo));
            conta.setCpf(cpf);

            callback.callback(conta);
        }
    }
}
