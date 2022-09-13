package prototype;

public class Pelicula implements Cloneable{

    private String titulo;
    private String año;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String año, int duracion) {
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
    }

    public Pelicula clonar() throws CloneNotSupportedException{
        return (Pelicula)this.clone();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
}
