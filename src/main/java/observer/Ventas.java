package observer;

public class Ventas implements DepartamentoObserver{
    @Override
    public void actualizarApertura(String nuevaApertura) {
        System.out.println("Departamento de Ventas nofificado, apertura: " + nuevaApertura);
    }

    @Override
    public void actualizarCierre(String nuevoCierre) {
        System.out.println("Departamento de Ventas nofificado, cidrre: " + nuevoCierre);
    }

    @Override
    public void actualizarMenu(Menu nuevoMenu) {
        System.out.println("Departamento de Ventas nofificado, menu: " + "primer plato -> " +nuevoMenu.getPrimerPlato() +
                ", segundo plato -> " + nuevoMenu.getSegundoPlato() + ", postre -> " + nuevoMenu.getPostre());
    }
}
