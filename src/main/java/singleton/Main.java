package singleton;

public class Main {

    public static void main(String[] args) {

        Gerente gerente = Gerente.getInstance();
        gerente.setNombre("Cristobal");
        gerente.setApellidos("Rosa Arjona");
        gerente.setDirección("Pasaje San Vicente, 2");
        gerente.setEmail("crisrogar@fedmail.com");
        gerente.setEdad(49);

        gerente.visualizarDatosGerente();

        Gerente otroGerente = Gerente.getInstance();
        otroGerente.visualizarDatosGerente();
    }
}
