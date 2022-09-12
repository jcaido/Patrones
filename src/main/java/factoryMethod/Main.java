package factoryMethod;

public class Main {

    public static void main(String[] args) {


        VehiculoFactory vehiculo = new VehiculoFactory("vo");
        vehiculo.vehiculo.entradaVehiculo("RENAULT", "CLIO", 12500d);

        VehiculoFactory vehiculo2 = new VehiculoFactory("demo");
        vehiculo2.vehiculo.entradaVehiculo("PEUGEOT", "508", 15600d);
    }
}
