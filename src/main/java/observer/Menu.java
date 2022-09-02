package observer;

public class Menu {

    private String primerPlato;
    private String segundoPlato;
    private String postre;
    private double precio;

    public Menu() {
    }

    public Menu(String primerPlato, String segundoPlato, String postre, double precio) {
        this.primerPlato = primerPlato;
        this.segundoPlato = segundoPlato;
        this.postre = postre;
        this.precio = precio;
    }

    public String getPrimerPlato() {
        return primerPlato;
    }

    public Menu setPrimerPlato(String primerPlato) {
        this.primerPlato = primerPlato;
        return this;
    }

    public String getSegundoPlato() {
        return segundoPlato;
    }

    public Menu setSegundoPlato(String segundoPlato) {
        this.segundoPlato = segundoPlato;
        return this;
    }

    public String getPostre() {
        return postre;
    }

    public Menu setPostre(String postre) {
        this.postre = postre;
        return this;
    }

    public double getPrecio() {
        return precio;
    }

    public Menu setPrecio(double precio) {
        this.precio = precio;
        return this;
    }
}
