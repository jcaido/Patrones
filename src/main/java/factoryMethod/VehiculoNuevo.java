package factoryMethod;

public class VehiculoNuevo implements Vehiculo{

    @Override
    public void entradaVehiculo(String marca, String modelo, double precioCompra) {

        System.out.println("VEHICULO NUEVO");
        System.out.println("marca: " + marca);
        System.out.println("modelo: " + modelo);
        System.out.println("precio de compra: " + precioCompra);
    }

}
