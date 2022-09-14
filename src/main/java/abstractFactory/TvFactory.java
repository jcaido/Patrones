package abstractFactory;

public interface TvFactory {

    public TvStandar crearTvStandar(String marca, String modelo, String pulgadas);
    public SmartTv crearSmartTv(String marca, String modelo, String pulgadas, String sistemaOperativo);
}
