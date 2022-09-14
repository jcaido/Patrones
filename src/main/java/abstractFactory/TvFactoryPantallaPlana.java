package abstractFactory;

public class TvFactoryPantallaPlana implements TvFactory{
    @Override
    public TvStandar crearTvStandar(String marca, String modelo, String pulgadas) {
        return new TvStandarPantallaPlana(marca, modelo, pulgadas);
    }

    @Override
    public SmartTv crearSmartTv(String marca, String modelo, String pulgadas, String sistemaOperativo) {
        return new SmartTvPantallaPlana(marca, modelo, pulgadas, sistemaOperativo);
    }
}
