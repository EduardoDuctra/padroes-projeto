package br.csi.padroes_revisao.prova2.command;

public class Device {

    private String nome;
    private boolean ligado;


    public Device(String nome) {
        this.nome = nome;
    }

    public void ligar (){
        ligado = true;
        System.out.println("Ligado");
    }

    public void desligar (){
        ligado = false;
        System.out.println("Desligado");
    }

    public void abrir(){
        ligado = true;
        System.out.println("Aberto");
    }

    public void fechar(){
        ligado = false;
        System.out.println("Fechado");
    }

    public void tocarMusica(){
        ligado = true;
        System.out.println("Tocando música");
    }

    public void pararMusica(){
        ligado = false;
        System.out.println("Parando música");
    }

    public void iniciarSeguranca() {
        ligado = true;
        System.out.println(nome + " sistema de segurança iniciado");
    }

    public void pararSeguranca() {
        ligado = false;
        System.out.println(nome + " sistema de segurança parado");
    }

}
