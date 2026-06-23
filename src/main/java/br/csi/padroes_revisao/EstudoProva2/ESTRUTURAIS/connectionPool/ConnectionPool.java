package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.connectionPool;

import lombok.SneakyThrows;

import javax.sql.DataSource;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//precisa dependencia externa para testar
public class ConnectionPool {

    private List<Connection> conexoesDisponiveis = new ArrayList<>();
    private List<Connection> conexoesCriadas = new ArrayList<>();
    private DataSource ds;



    public ConnectionPool(DataSource ds) throws SQLException {
        this.ds = ds;

        for(int i=0; i<3; i++){
            Connection o = criaConnection();
            conexoesCriadas.add(o);
            conexoesDisponiveis.add(o);
        }
    }

    private void release(Connection con) {
        synchronized (this) {
            if (conexoesCriadas.contains(con)) {
                System.out.println("[" + Thread.currentThread() + "] Devolveu objeto.");
                conexoesDisponiveis.add(con);
            } else {
                throw new IllegalArgumentException("objeto devolvido não pertence ao pool.");
            }
        }
    }

    @SneakyThrows
    public Connection acquire() {
        synchronized (this) {
            if (conexoesDisponiveis.isEmpty()) {
                if (conexoesCriadas.size() == 20) {
                    //coloca para esperar
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, vai esperar...");
                    while (conexoesDisponiveis.isEmpty()) {
                        this.wait();
                    }
                    System.out.println("[" + Thread.currentThread() + "] Acordou. ");
                    return conexoesDisponiveis.remove(0);
                } else {
                    //cria objeto novo
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, criando novo...");
                    Connection o = criaConnection();
                    conexoesCriadas.add(o);
                    return o;
                }
            } else {
                //tem objeto disponivel
                System.out.println("[" + Thread.currentThread() + "] Retornando objeto já disponível de " + conexoesDisponiveis.size() + "...");
                return conexoesDisponiveis.remove(0);
            }
        }
    }


    @SneakyThrows
    private Connection criaConnection() throws SQLException {
        return (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),
                new Class[] { Connection.class },
                new ConnectionInvHandler(ds.getConnection()));
    }

    private class ConnectionInvHandler implements InvocationHandler {

        private Connection conn;

        public ConnectionInvHandler(Connection conn) {
            this.conn = conn;
        }

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            if (method.getName().equals("close")) {
                release(conn);
                return null;
            } else {
                Object ret = method.invoke(conn, args);
                return ret;
            }
        }

    }
}
