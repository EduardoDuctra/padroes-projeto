package br.csi.padroes_revisao.EstudoProva2.extra.composite.questao1;

public class Main {
    public static void main(String[] args) {

        Folder raiz = new Folder("raiz");
        Folder src  = new Folder("pasta");
        Folder images  = new Folder("imagens");

        File f1 = new File("Main.java");
        File f2 = new File("Usuario.java");
        File f3 = new File("logo.png");
        File f4 = new File("README.md");


        src.add(f1);
        src.add(f2);

        images.add(f3);

        raiz.add(src);
        raiz.add(images);
        raiz.add(f4);

        raiz.show();




    }
}
