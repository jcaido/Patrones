package observer;

public class Contabilidad implements DepartamentoObserver{


    @Override
    public void actualizarApertura(String nuevaApertura) {
        System.out.println("Departamento de Contabilidad nofificado, apertura: " + nuevaApertura);
    }

    @Override
    public void actualizarCierre(String nuevoCierre) {
        System.out.println("Departamento de Contabilidad nofificado, cierre: " + nuevoCierre);
    }

    @Override
    public void actualizarMenu(Menu nuevoMenu) {
        System.out.println("Departamento de Contabilidad nofificado, menu: " + "primer plato -> " +nuevoMenu.getPrimerPlato() +
                ", segundo plato -> " + nuevoMenu.getSegundoPlato() + ", postre -> " + nuevoMenu.getPostre());
    }
}
