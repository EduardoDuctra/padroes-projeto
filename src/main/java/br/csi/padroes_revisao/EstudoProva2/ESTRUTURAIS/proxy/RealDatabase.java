package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.proxy;

import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RealDatabase implements Database{


    private DataSource dataSource;

    public RealDatabase(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @SneakyThrows
    @Override
    public String query(String sql) {
        Connection con = dataSource.getConnection();
        Statement statement = con.createStatement();

        if(statement.execute(sql)){

            //Percorre os resultados e conta quantas linhas foram retornadas
            ResultSet rs = statement.getResultSet();
            int cont = 0;

            //conta os resultados
            while(rs.next()){
                cont++;
            }

            return cont + "rows returned";
        } else{

            //Se for um UPDATE, INSERT ou DELETE, retorna a quantidade de linhas afetadas
            return statement.getUpdateCount() + "rows affected";
        }

    }

    @SneakyThrows
    @Override
    public void authenticate(String username, String password) {
        dataSource.getConnection(username, password);
    }
}
