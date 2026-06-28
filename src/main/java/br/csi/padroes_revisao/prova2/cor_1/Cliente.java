package br.csi.padroes_revisao.prova2.cor_1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cliente {

    private String id;
    private double limiteCredito;
    private boolean negativado;

    @Override
    public boolean equals(Object o){
        if (o == null||getClass()!=o.getClass())
            return false;
        Cliente cliente=(Cliente)o;
        return Objects.equals(id,cliente.id);
    }

    @Override
    public int hashCode(){
        return Objects.hashCode(id);}
}
