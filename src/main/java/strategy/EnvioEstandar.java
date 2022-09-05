package strategy;

public class EnvioEstandar implements EnvioStrategy{


    @Override
    public String envio() {

        return "Envio estandar, plazo maximo de entrega antes de 5 dias";
    }

    @Override
    public Double costeEnvio() {

        return 0D;
    }
}
