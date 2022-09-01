package builder;

public class Main {

    public static void main(String[] args) {

        Ordenador miOrdenador = new Ordenador.Builder().setId(1L).build();

        Ordenador ordenadorX = new Ordenador.Builder().setId(2L).setMarca("IBM").setSistemaOperativo("Windows").build();

        Ordenador miPortatil = new Ordenador.Builder().setId(3L).setMarca("Apple").setTipo("Portatil").build();

    }
}

