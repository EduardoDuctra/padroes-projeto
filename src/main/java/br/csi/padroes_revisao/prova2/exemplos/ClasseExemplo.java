package br.csi.padroes_revisao.prova2.exemplos;


import br.csi.padroes_revisao.prova2.annotation.DeepCopy;

import java.util.Date;

public class ClasseExemplo {

    private Long id;
    private Long codigo;
    private String atributo1;
    public String atributo2;
    public Date dataCriacao;

    @DeepCopy
    private ClasseExemplo2 exemplo2;

    public String getAtributo1() {
        return atributo1;
    }

    public void setAtributo1(String atributo1) {
        this.atributo1 = atributo1;
    }

    public ClasseExemplo2 getExemplo2() {
        return exemplo2;
    }

    public void setExemplo2(ClasseExemplo2 exemplo2) {
        this.exemplo2 = exemplo2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", codigo=" + codigo +
                ", atributo1='" + atributo1 + '\'' +
                ",atributo2='" + atributo2 + '\'' +
                ",dataCriacao=" + dataCriacao +
                ",exemplo2=" + exemplo2 +
                "} " + super.toString();
    }
}
