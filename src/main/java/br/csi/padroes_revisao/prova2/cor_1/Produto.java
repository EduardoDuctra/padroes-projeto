package br.csi.padroes_revisao.prova2.cor_1;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Builder
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Produto {

    private String codigo;
    private String nome;
    private boolean emEstoque;

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto=(Produto)o;
        return Objects.equals(codigo,produto.codigo);}

    @Override
    public int hashCode(){
        return Objects.hashCode(codigo);}
}
