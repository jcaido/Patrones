package prototype;

public class Main {

    public static void main(String[] args) {

        Libro libro = new Libro("El señor de los anillos",
                "JRR Tolkien",
                "1976",
                1120,
                30);
        System.out.println(libro.getTitulo() + ", " + libro.getAutor() + ", " + libro.getAñoPublicacion() + ", " +
                libro.getNumeroPaginas() + " paginas, " + libro.getPrecio() + " Euros");


        Libro libroClonado = libro.clonar();
        System.out.println(libroClonado.getTitulo() + ", " + libroClonado.getAutor() + ", " + libroClonado.getAñoPublicacion() + ", " +
                libroClonado.getNumeroPaginas() + " paginas, " + libroClonado.getPrecio() + " Euros");


        Pelicula pelicula = new Pelicula("Interestelar", "2015", 120);
        System.out.println(pelicula.getTitulo() + ", " + pelicula.getAño() + ", " + pelicula.getDuracion() + " minutos");

        try {
            Pelicula peliculaClonada = pelicula.clonar();
            System.out.println(pelicula.getTitulo() + ", " + pelicula.getAño() + ", " + pelicula.getDuracion() + " minutos");
        } catch (CloneNotSupportedException e){
            System.out.println("No es posible la clonacion: " + e.getMessage());
        }

    }
}
