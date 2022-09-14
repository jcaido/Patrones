package abstractFactory;

public class TvStandarPantallaPlana extends TvStandar{

    public TvStandarPantallaPlana(String marca, String modelo, String pulgadas) {
        super(marca, modelo, pulgadas);
    }

    @Override
    public void mostrarTv() {

        System.out.println("Television estandar con pantalla plana");
        System.out.println("marca => " + getMarca());
        System.out.println("modelo => " + getModelo());
        System.out.println("pulgadas => " + getPulgadas());
        System.out.println("=======================================");
    }
}
