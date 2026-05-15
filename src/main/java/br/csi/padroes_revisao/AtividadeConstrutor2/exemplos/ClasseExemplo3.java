package br.csi.padroes_revisao.AtividadeConstrutor2.exemplos;

public class ClasseExemplo3 {

    private Long codigo;
    public ClasseExemplo exemplo;

    public Long getCodigo() {
        return codigo;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "{" +
                "codigo=" + codigo +
                ", exemplo=" + exemplo +
                '}' + super.toString();
    }
}
