package br.csi.padroes_revisao.pool;

import lombok.SneakyThrows;

import java.lang.reflect.InvocationTargetException;
import java.security.PermissionCollection;
import java.util.ArrayList;
import java.util.List;

//T -> qualquer tipo de objeto
public class PoolGenerico <T> implements Pool<T> {

    private Class<T>clazz;
    private List<T> objetosDisponiveis = new ArrayList<T>();
    private List<T> objetosCriados = new ArrayList<T>();
    private int minimo =3;
    private int maximo =20;


    @SneakyThrows
    private T criarInstancia()  {
        return clazz.getDeclaredConstructor().newInstance();
    }

    //crio o pool. Coloco os objetos nas listas
    public PoolGenerico(Class<T> clazz) {
        this.clazz = clazz;

        for(int i=0; i<3; i++){
            T o = criarInstancia();
            objetosCriados.add(o);
            objetosDisponiveis.add(o);
        }
    }


    @SneakyThrows
    @Override
    public T acquire() {
        synchronized (this){
            //verificar se a lista de pool disponiveis ta vazia
            if(objetosDisponiveis.isEmpty()){

                //tem 20? : thread em espera
                if( objetosCriados.size() == 20){
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, vai esperar...");

                    while (objetosDisponiveis.isEmpty()){
                        this.wait();
                    }

                    System.out.println("[" + Thread.currentThread() + "] Acordou. ");

                    //remove o primeiro objeto do pool
                    return objetosDisponiveis.remove(0);

                } else{
                    //cria novo objeto
                    System.out.println("[" + Thread.currentThread() + "] Não existem objetos, criando novo...");
                    T o = criarInstancia();

                    objetosCriados.add(o);
                    return o;
                }

            } else{

                //tem objeto disponivel
                System.out.println("[" + Thread.currentThread() + "] Retornando objeto já disponível de " + objetosDisponiveis.size() + "...");
                return objetosDisponiveis.remove(0);

            }
        }
    }

    @Override
    public void release(T t) {
        synchronized (this){
            //se a lista de objetos criados tem T
            if(objetosCriados.contains(t)){
                System.out.println("[" + Thread.currentThread() + "] Devolveu objeto.");

                //libera ele
                objetosDisponiveis.add(t);

                //notifica as threads dormindo
                this.notifyAll();
            } else {
                throw new IllegalArgumentException("objeto devolvido não pertence ao pool.");

            }
        }
    }
}
