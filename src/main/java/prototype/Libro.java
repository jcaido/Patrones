package prototype;

public class Libro {

    private String titulo;
    private String autor;
    private String añoPublicacion;
    private int numeroPaginas;
    private double  precio;

    public Libro() {
    }

    public Libro(String titulo, String autor, String añoPublicacion, int numeroPaginas, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoPublicacion = añoPublicacion;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
    }

    public Libro clonar() {

        Libro libroClonado = new Libro();
        libroClonado.titulo = titulo;
        libroClonado.autor = autor;
        libroClonado.añoPublicacion = añoPublicacion;
        libroClonado.numeroPaginas = numeroPaginas;
        libroClonado.precio = precio;

        return libroClonado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(String añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
