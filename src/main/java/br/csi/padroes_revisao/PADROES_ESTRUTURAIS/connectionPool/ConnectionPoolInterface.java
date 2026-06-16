//package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.connectionPool;
//
//import lombok.SneakyThrows;
//
//import java.lang.reflect.Proxy;
//import java.sql.Connection;
//import java.sql.DatabaseMetaData;
//import java.sql.SQLException;
//
//public interface ConnectionPoolInterface {
//    @SneakyThrows
//    default Connection criaConnection() throws SQLException {
//        DatabaseMetaData dataSource;
//        return (Connection) Proxy.newProxyInstance(ConnectionPool.class.getClassLoader(),
//                new Class[] { Connection.class },
//                new ConnectionPool.ConnectionInvHandler(dataSource.getConnection()));
//    }
//
//    @SneakyThrows
//    Connection acquire();
//
//    void release(Connection con);
//}
