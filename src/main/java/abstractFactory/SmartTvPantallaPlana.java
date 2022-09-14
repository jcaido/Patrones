package abstractFactory;

public class SmartTvPantallaPlana extends SmartTv{


    public SmartTvPantallaPlana(String marca, String modelo, String pulgadas, String sistemaOperativo) {
        super(marca, modelo, pulgadas, sistemaOperativo);
    }

    @Override
    public void mostrarTv() {

        System.out.println("SmartTv con pantalla plana");
        System.out.println("marca => " + getMarca());
        System.out.println("modelo => " + getModelo());
        System.out.println("pulgadas => " + getPulgadas());
        System.out.println("sistema operativo => " + getSistemaOperativo());
        System.out.println("====================================");
    }
}
