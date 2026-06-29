package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao1;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Component{


    private List<Component> children = new ArrayList<>();

    public Folder(String name) {
        super(name);
    }

    public void add(Component c) {
        children.add(c);
    }

    @Override
    public void show() {

        System.out.println(name);

        for(Component component : children){
            component.show();
        }
    }
}
