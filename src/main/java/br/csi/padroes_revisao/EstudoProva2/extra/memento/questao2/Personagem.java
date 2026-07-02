package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao2;

public class Personagem {

    private int x;
    private int y;

    public void mover(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void mostrarPosicao(){
        System.out.println("Posição: (" + x + "," + y + ")");
    }

    public Checkpoint salvar(){
        return new Checkpoint(x, y);
    }

    public void restaurar(Checkpoint checkpoint){
        this.x = checkpoint.getX();
        this.y = checkpoint.getY();
    }
}
