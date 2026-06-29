package br.csi.padroes_revisao.EstudoProva2.extra.adapter.questao2;

public class Main {
    public static void main(String[] args) {

        TemperatureSensor sensor = new TemperatureAdapter(new OldTemperatureSensor());


        System.out.println("Temperatura: "
                + sensor.getTemperatura() + " °C");

    }
}
