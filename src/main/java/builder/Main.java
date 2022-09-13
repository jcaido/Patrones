package builder;

public class Main {

    public static void main(String[] args) {

        Ordenador ordenador = new OrdenadorBuilder("portatil")
                .setMarca("Lenovo")
                .setSistemaOperativo("Windows")
                .build();

        Ordenador miOrdenador = new OrdenadorBuilder("sobremesa")
                .setLectorTarjetas(true)
                .setNumeroDeUsbs(4)
                .setWebCam(true)
                .setDvd(false)
                .build();

        System.out.println("tipo=> " + ordenador.getTipo());
        System.out.println("marca=> " + ordenador.getMarca());
        System.out.println("sistema operativo=> " + ordenador.getSistemaOperativo());

        System.out.println("tipo=> " + miOrdenador.getTipo());
        System.out.println("lector tarjetas=> " + miOrdenador.isLectorTarjetas());
        System.out.println("numero de usbs=> " + miOrdenador.getNumeroDeUsbs());
        System.out.println("webcam=> " + miOrdenador.isWebCam());
        System.out.println("dvd=> " + miOrdenador.isDvd());
    }
}

