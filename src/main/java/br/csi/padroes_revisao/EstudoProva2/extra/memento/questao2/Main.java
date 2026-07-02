package br.csi.padroes_revisao.EstudoProva2.extra.memento.questao2;

public class Main {
    public static void main(String[] args) {

        Personagem personagem  = new Personagem();
        Historico historico = new Historico();

        personagem.mover(10,20);
        historico.salvar(personagem.salvar());

        personagem.mover(30, 40);
        historico.salvar(personagem.salvar());

        personagem.mover(80, 90);

        personagem.mostrarPosicao();

        personagem.restaurar(historico.getCheckpoint(0));
        personagem.mostrarPosicao();





    }
}
