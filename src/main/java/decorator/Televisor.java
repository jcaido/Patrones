package decorator;

public abstract class Televisor {

    private String marca;
    private String pulgadas;
    private boolean pantallaPlana;
    private boolean conexionInternet;
    private String sonido;


    public abstract String mostrarTelevisor();

    public abstract double precio();


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isPantallaPlana() {
        return pantallaPlana;
    }

    public void setPantallaPlana(boolean pantallaPlana) {
        this.pantallaPlana = pantallaPlana;
    }

    public boolean isConexionInternet() {
        return conexionInternet;
    }

    public void setConexionInternet(boolean conexionInternet) {
        this.conexionInternet = conexionInternet;
    }

    public String getSonido() {
        return sonido;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
