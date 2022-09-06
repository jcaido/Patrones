package proxy;

public class Main {

    public static void main(String[] args) {

        Archivo miArchivo = new ProxyArchivoDatos("proteinas.csv");

        miArchivo.abrirArchivo();
    }
}
