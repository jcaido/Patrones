package strategy;

public class EnvioRapido implements EnvioStrategy{
    @Override
    public String envio() {

        return "Envio rapido, plazo maximo de entrega antes de 3 dias";
    }

    @Override
    public Double costeEnvio() {

        return 3D;
    }
}
