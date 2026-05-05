package br.csi.padroes_revisao.pool;

import br.csi.padroes_revisao.exercicio1.Imovel;
import lombok.SneakyThrows;

import java.security.SecureRandom;
import java.util.Random;

public class Main {

    private PoolGenerico<Imovel> pool = new PoolGenerico<>(Imovel.class);

    @SneakyThrows
    public static void main(String[] args) {

        new Main();
        Thread.sleep(1000000);

    }

    Main(){
        inicializar();
    }

    public void inicializar(){
        for(int i = 0; i < 100; i++){

            //Java Virtual Machine gerencia essa thread
            Thread.ofVirtual().start(new Runnable() {
                @SneakyThrows
                @Override
                public void run() {

                    Random random = new SecureRandom();

                    while (true){
                        Thread.sleep(random.nextInt(1000));
                        Imovel imovel = pool.acquire();

                        Thread.sleep(random.nextInt(2000));
                        pool.release(imovel);

                    }
                }
            });
        }
    }

}
