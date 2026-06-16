//package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.connectionPool;
//
//import br.csi.padroes_revisao.PADROES_ESTRUTURAIS.proxy.Database;
//import lombok.SneakyThrows;
//
//import javax.sql.DataSource;
//import java.lang.reflect.InvocationHandler;
//import java.lang.reflect.Method;
//import java.lang.reflect.Proxy;
//import java.sql.Connection;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//
//public class ConnectionPool implements ConnectionPoolInterface {
//
//
//    private List conexoesDisponiveis = new ArrayList<>();
//    private List conexoesCriadas = new ArrayList<>();
//    private DataSource dataSource;
//
//    private int minimo =3;
//    private int maximo =20;
//
//
//    class ConnectionInvHandler implements InvocationHandler {
//
//        private Connection conn;
//
//        public ConnectionInvHandler(Connection conn) {
//            this.conn = conn;
//        }
//
//        @Override
//        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//            if (method.getName().equals("close")) {
//                release(conn);
//                return null;
//            } else {
//                Object ret = method.invoke(conn, args);
//                return ret;
//            }
//        }
//
//    }
//
//
//    //crio o pool. Coloco os objetos nas listas
//    public ConnectionPool(Database ds) throws SQLException {
//        this.dataSource = (DataSource) ds;
//
//        for(int i=0; i<3; i++){
//
//            Connection o = criaConnection();
//            conexoesCriadas.add(o);
//            conexoesDisponiveis.add(o);
//        }
//    }
//
//
//    @SneakyThrows
//    @Override
//    public Connection acquire() {
//        synchronized (this){
//            //verificar se a lista de pool disponiveis ta vazia
//            if(conexoesDisponiveis.isEmpty()){
//
//                //tem 20? : thread em espera
//                if( conexoesCriadas.size() == 20){
//                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, vai esperar...");
//
//                    while (conexoesDisponiveis.isEmpty()){
//                        this.wait();
//                    }
//
//                    System.out.println("[" + Thread.currentThread() + "] Acordou. ");
//
//                    //remove o primeiro objeto do pool
//                    return (Connection) conexoesDisponiveis.remove(0);
//
//                } else{
//                    //cria novo objeto
//                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, criando novo...");
//                    Connection o = criaConnection();
//
//                    conexoesCriadas.add(o);
//                    return o;
//                }
//
//            } else{
//
//                //tem objeto disponivel
//                System.out.println("[" + Thread.currentThread() + "] Retornando objeto já disponível de " + conexoesDisponiveis.size() + "...");
//                return (Connection) conexoesDisponiveis.remove(0);
//
//            }
//        }
//    }
//
//    @Override
//    public void release(Connection con) {
//        synchronized (this){
//            //se a lista de objetos criados tem T
//            if(conexoesCriadas.contains(con)){
//                System.out.println("[" + Thread.currentThread() + "] Devolveu objeto.");
//
//                //libera ele
//                conexoesDisponiveis.add(con);
//
//                //notifica as threads dormindo
//                this.notifyAll();
//            } else {
//                throw new IllegalArgumentException("objeto devolvido não pertence ao pool.");
//
//            }
//        }
//    }
//}
