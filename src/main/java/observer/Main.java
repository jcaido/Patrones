package observer;

public class Main {

    public static void main(String[] args) {

        CentroDeTrabajo centroAguilar = new CentroDeTrabajo("08:00", "20:00",
                new Menu("sopa de guisantes", "solomillo al jerez", "cafe", 12));


        centroAguilar.addObserver(new Contabilidad());
        centroAguilar.addObserver(new Ventas());
        centroAguilar.addObserver(new Produccion());

        //centroAguilar.cambiarApertura("07:00");

        //centroAguilar.cambiarCierre("19:00");

        Menu menuMartes = new Menu("revuelto de la huerta", "entrecot a la brasa", "fruta del tiempo", 12);
        centroAguilar.cambiarMenu(menuMartes);
    }
}
