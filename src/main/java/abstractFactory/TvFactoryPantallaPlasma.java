package abstractFactory;

public class TvFactoryPantallaPlasma implements TvFactory{
    @Override
    public TvStandar crearTvStandar(String marca, String modelo, String pulgadas) {
        return new TvStandarPantallaPlasma(marca, modelo, pulgadas);
    }

    @Override
    public SmartTv crearSmartTv(String marca, String modelo, String pulgadas, String sistemaOperativo) {
        return new SmartTvPantallaPlasma(marca, modelo, pulgadas, sistemaOperativo);
    }
}
