package abstractFactory;

public class Main {

    public static void main(String[] args) {

        TvFactory factoryPantallaPlana = new TvFactoryPantallaPlana();
        TvFactory factoryPantallaPlasma = new TvFactoryPantallaPlasma();

        SmartTv tv1 = factoryPantallaPlana.crearSmartTv("SANSUNG", "50W", "40", "ANDROID");
        tv1.mostrarTv();

        TvStandar tv2 = factoryPantallaPlasma.crearTvStandar("LG", "VENTURA", "40");
        tv2.mostrarTv();

        SmartTv tv3 = factoryPantallaPlasma.crearSmartTv("TOSHIBA", "7YACCEPT", "50", "IOs");
        tv3.mostrarTv();

    }
}
