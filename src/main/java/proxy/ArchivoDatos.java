package proxy;

public class ArchivoDatos implements Archivo{

    private String nombreArchivo;

    public ArchivoDatos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void abrirArchivo() {

        System.out.println("abriendo archivo " + this.nombreArchivo);
        System.out.println("obteniendo datos");
    }

}
