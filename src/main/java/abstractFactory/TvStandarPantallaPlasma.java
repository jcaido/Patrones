package abstractFactory;

public class TvStandarPantallaPlasma extends TvStandar{

    public TvStandarPantallaPlasma(String marca, String modelo, String pulgadas) {
        super(marca, modelo, pulgadas);
    }

    @Override
    public void mostrarTv() {

        System.out.println("Television estandar con pantalla de plasma");
        System.out.println("marca => " + getMarca());
        System.out.println("modelo => " + getModelo());
        System.out.println("pulgadas => " + getPulgadas());
        System.out.println("=======================================");

    }
}
