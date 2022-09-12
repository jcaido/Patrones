package factoryMethod;

public class VehiculoFactory {

    Vehiculo vehiculo;

    private VehiculoFactory() {}

    public VehiculoFactory(String tipoVehiculo) {

        if (tipoVehiculo.equalsIgnoreCase("vo")) {
            vehiculo = new VehiculoOcasion();
        } else if (tipoVehiculo.equalsIgnoreCase("vn")) {
            vehiculo = new VehiculoNuevo();
        } else if (tipoVehiculo.equalsIgnoreCase("demo")) {
            vehiculo = new VehiculoDemo();
        }
    }
}
