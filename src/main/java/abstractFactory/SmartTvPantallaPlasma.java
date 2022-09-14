package abstractFactory;

public class SmartTvPantallaPlasma extends SmartTv{


    public SmartTvPantallaPlasma(String marca, String modelo, String pulgadas, String sistemaOperativo) {
        super(marca, modelo, pulgadas, sistemaOperativo);
    }

    @Override
    public void mostrarTv() {

        System.out.println("SmartTv con pantalla de plasma");
        System.out.println("marca => " + getMarca());
        System.out.println("modelo => " + getModelo());
        System.out.println("pulgadas => " + getPulgadas());
        System.out.println("sistema operativo => " + getSistemaOperativo());
        System.out.println("====================================");
    }
}
