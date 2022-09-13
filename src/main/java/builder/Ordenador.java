package builder;

public class Ordenador {

    public String tipo;
    public String marca;
    public String sistemaOperativo;
    public int pulgadasPantalla;
    public int numeroDeUsbs;
    public boolean dvd;
    public boolean lectorTarjetas;
    public boolean webCam;
    public boolean puertoHDMI;
    public Bateria tipoBateria;
    public Teclado tipoTeclado;


    public String getTipo() {
        return tipo;
    }
    public String getMarca() {
        return marca;
    }
    public String getSistemaOperativo() {
        return sistemaOperativo;
    }
    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }
    public int getNumeroDeUsbs() {
        return numeroDeUsbs;
    }
    public boolean isDvd() {
        return dvd;
    }
    public boolean isLectorTarjetas() {
        return lectorTarjetas;
    }
    public boolean isWebCam() {
        return webCam;
    }
    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }
    public Bateria getTipoBateria() {
        return tipoBateria;
    }
    public Teclado getTipoTeclado() {
        return tipoTeclado;
    }



}
