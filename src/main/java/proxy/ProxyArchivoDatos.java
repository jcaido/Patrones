package proxy;

public class ProxyArchivoDatos implements Archivo{

    private ArchivoDatos archivoDatos;
    private String nombreArchivo;

    public ProxyArchivoDatos(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    @Override
    public void abrirArchivo() {

        if (archivoDatos == null)
            this.archivoDatos = new ArchivoDatos(nombreArchivo);
        archivoDatos.abrirArchivo();
    }
}
