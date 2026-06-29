package br.csi.padroes_revisao.EstudoProva2.extra.adapter.questao2;

public class TemperatureAdapter implements TemperatureSensor{

    private OldTemperatureSensor oldSensor;

    public TemperatureAdapter(OldTemperatureSensor oldSensor) {
        this.oldSensor = oldSensor;
    }

    @Override
    public double getTemperatura() {

        double fahrenheit = oldSensor.getTemperatureFahrenheit();
        return (fahrenheit - 32) * 5 / 9;

    }
}
