package br.csi.padroes_revisao.EstudoProva2.ESTRUTURAIS.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * PROXY é como se fosse uma fachada ao objeto
 * Passa pelo proxy, dps objeto real
 */
public class SecureDatabaseProxy implements InvocationHandler {

    private Database database;
    private boolean autenticado = false;

    public SecureDatabaseProxy(Database database) {
        this.database = database;
    }


    //criação de proxy
    //posso fazer sempre assim
    public static Database createSecureDatabase(Database database) {
        return (Database) Proxy.newProxyInstance(
                SecureDatabaseProxy.class.getClassLoader(),
                new Class[] { Database.class },  new SecureDatabaseProxy(database));
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        //metodo de autenticar
        if(method.getName().equals("authenticate")){
            try{

                //chamo o metodo aqui
                method.invoke(database, args[0]);
                autenticado = true;

            } catch (Exception e){
                autenticado = false;
                throw e;
            }

            return null;
        } else{

            //não é autenticar -> SELECT/DELETE/INSERT/UPDATE
            String sql = (String) args[0];

            //qualquer um diferente de select precisa de autenticação
            if (!sql.toLowerCase().trim().startsWith("select")) {
                if (!autenticado) {
                    throw new IllegalAccessException("nao esta autenticado.");
                }
            }
            return method.invoke(database, args);
        }
    }
}
