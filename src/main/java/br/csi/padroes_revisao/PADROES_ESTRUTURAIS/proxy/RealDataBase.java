package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.proxy;

import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RealDataBase implements Database{

    private DataSource dataSource;

    private RealDataBase(DataSource dataSource){
        this.dataSource = dataSource;
    }

    @SneakyThrows
    @Override
    public String query(String sql) {

        try( Connection connection = dataSource.getConnection();
             Statement statement = connection.createStatement();){

            if(statement.execute(sql)){
                ResultSet resultSet = statement.getResultSet();
                int cont = 0;

                while(resultSet.next()){
                    cont++;
                }
                return cont + " rows returned.";
            } else{
                return statement.getUpdateCount() +  " rows affected.";
            }

        }


    }

    @SneakyThrows
    @Override
    public void authenticate(String username, String password) {
        dataSource.getConnection(username, password);
    }
}
