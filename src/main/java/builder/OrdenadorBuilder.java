package builder;

public class OrdenadorBuilder {

    Ordenador ordenador;

    public OrdenadorBuilder(String tipo) {
        ordenador = new Ordenador();
        ordenador.tipo = tipo;
    }

    public OrdenadorBuilder setMarca(String marca) {
        ordenador.marca = marca;
        return this;
    }

    public OrdenadorBuilder setSistemaOperativo(String sistemaOperativo) {
        ordenador.sistemaOperativo = sistemaOperativo;
        return this;
    }

    public OrdenadorBuilder setPulgadasPantalla(int pulgadasPantalla) {
        ordenador.pulgadasPantalla = pulgadasPantalla;
        return this;
    }

    public OrdenadorBuilder setNumeroDeUsbs(int numeroDeUsbs) {
        ordenador.numeroDeUsbs = numeroDeUsbs;
        return this;
    }

    public OrdenadorBuilder setDvd(boolean dvd) {
        ordenador.dvd = dvd;
        return this;
    }

    public OrdenadorBuilder setLectorTarjetas(boolean lectorTarjetas) {
        ordenador.lectorTarjetas = lectorTarjetas;
        return this;
    }

    public OrdenadorBuilder setWebCam(boolean webCam) {
        ordenador.webCam = webCam;
        return this;
    }

    public OrdenadorBuilder setPuertoHDMI(boolean puertoHDMI) {
        ordenador.puertoHDMI = puertoHDMI;
        return this;
    }

    public OrdenadorBuilder setTipoBateria(Bateria tipoBateria) {
        ordenador.tipoBateria = tipoBateria;
        return this;
    }

    public OrdenadorBuilder setTipoTeclado(Teclado tipoTeclado) {
        ordenador.tipoTeclado = tipoTeclado;
        return this;
    }

    public Ordenador build() {
        return ordenador;
    }
}
