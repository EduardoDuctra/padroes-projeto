package br.csi.padroes_revisao.PADROES_ESTRUTURAIS.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SecureDatabaseProxy implements InvocationHandler {

    private Database database;
    private boolean autenticado = false;

    public SecureDatabaseProxy(Database database) {
        this.database = database;
    }

    private static Database createSecureDatabase(Database database) {
        return (Database) Proxy.newProxyInstance(
                SecureDatabaseProxy.class.getClassLoader(),
                new Class[] {Database.class}, new SecureDatabaseProxy(database)
        );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if(method.getName().equals("authenticate")) {
            try {

                method.invoke(database, args[0]);
                autenticado = true;

            }catch (Exception e) {
                autenticado = false;
                throw e;
            }
            return null;
        } else{
            String sql = (String) args[0];

            if(!sql.toLowerCase().trim().startsWith("select")) {
                if(!autenticado){
                    throw new IllegalAccessException("nao esta autenticado.");
                }
            }
            return method.invoke(database, args);
        }

    }
}
