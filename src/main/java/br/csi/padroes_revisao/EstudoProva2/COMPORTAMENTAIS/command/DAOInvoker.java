package br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command;

import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos.AlteraCommand;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos.ExcluiCommand;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos.InsereCommand;
import br.csi.padroes_revisao.EstudoProva2.COMPORTAMENTAIS.command.comandos.SelecionaCommand;
import br.csi.padroes_revisao.REVISAO.exercicio2.infra.Conta;
import lombok.Data;
import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOInvoker {

    private List<Command> commands = new ArrayList<>();
    private DataSource dataSource;


    public void inserer(Conta conta, DAOCallback callback){
        InsereCommand commando = new InsereCommand(conta, callback);
        agendaCommand(commando);
    }

    public synchronized void excluir(Conta conta, DAOCallback callback) {
        ExcluiCommand excluiCommand = new ExcluiCommand(conta.getNumeroConta(), callback);
        agendaCommand(excluiCommand);
    }

    public synchronized void alterar(Conta conta, DAOCallback callback) {
        AlteraCommand alteraCommand = new AlteraCommand(conta, callback);
        agendaCommand(alteraCommand);
    }

    public synchronized void selecionar(Long numero, DAOCallback callback) {
        SelecionaCommand selecionaCommand = new SelecionaCommand(numero, callback);
        agendaCommand(selecionaCommand);
    }

    @SneakyThrows
    private synchronized void agendaCommand(Command command) {
        commands.add(command);
        if (commands.size() > 20) {
            try (Connection con = dataSource.getConnection()) {
                try {
                    batchInvoke(con);
                    con.commit();
                } catch (SQLException e) {
                    try { con.rollback(); } catch (SQLException ex) {}
                }
            }
            commands.clear();
        }
    }

    private void batchInvoke(Connection con) throws SQLException {
        for (Command command : commands) {
            command.execute(con);
        }
    }




}
