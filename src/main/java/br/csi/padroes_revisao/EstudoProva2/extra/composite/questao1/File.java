package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao1;

public class File extends Component {

    public File(String name) {
        super(name);
    }

    @Override
    public void show() {
        System.out.println(name);
    }
}