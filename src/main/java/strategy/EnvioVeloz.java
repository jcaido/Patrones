package strategy;

public class EnvioVeloz implements EnvioStrategy{
    @Override
    public String envio() {

        return "Envio veloz, plazo maximo de entrega antes de 1 dia";
    }

    @Override
    public Double costeEnvio() {

        return 5D;
    }
}
