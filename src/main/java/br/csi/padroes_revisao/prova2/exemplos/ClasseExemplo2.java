package br.csi.padroes_revisao.prova2.exemplos;


import br.csi.padroes_revisao.prova2.annotation.DeepCopy;

public class ClasseExemplo2 {

    private Long codigo;
    private String nome;

    @DeepCopy
    public ClasseExemplo3 exemplo3;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                ",nome='" + nome + '\'' +
                ",exemplo3=" + exemplo3 +
                "}" + super.toString();
    }
}
