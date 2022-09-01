package builder;

public class Ordenador {

    private Long id;
    private String tipo;
    private String marca;
    private String sistemaOperativo;
    private int pulgadasPantalla;
    private int numeroDeUsbs;
    private boolean dvd;
    private boolean lectorTarjetas;
    private boolean webCam;
    private boolean puertoHDMI;
    private Bateria tipoBateria;
    private Teclado tipoTeclado;


    public Ordenador(Long id, String tipo, String marca, String sistemaOperativo, int pulgadasPantalla, int numeroDeUsbs, boolean dvd, boolean lectorTarjetas, boolean webCam, boolean puertoHDMI, Bateria tipoBateria, Teclado tipoTeclado) {
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.sistemaOperativo = sistemaOperativo;
        this.pulgadasPantalla = pulgadasPantalla;
        this.numeroDeUsbs = numeroDeUsbs;
        this.dvd = dvd;
        this.lectorTarjetas = lectorTarjetas;
        this.webCam = webCam;
        this.puertoHDMI = puertoHDMI;
        this.tipoBateria = tipoBateria;
        this.tipoTeclado = tipoTeclado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getPulgadasPantalla() {
        return pulgadasPantalla;
    }

    public void setPulgadasPantalla(int pulgadasPantalla) {
        this.pulgadasPantalla = pulgadasPantalla;
    }

    public int getNumeroDeUsbs() {
        return numeroDeUsbs;
    }

    public void setNumeroDeUsbs(int numeroDeUsbs) {
        this.numeroDeUsbs = numeroDeUsbs;
    }

    public boolean isDvd() {
        return dvd;
    }

    public void setDvd(boolean dvd) {
        this.dvd = dvd;
    }

    public boolean isLectorTarjetas() {
        return lectorTarjetas;
    }

    public void setLectorTarjetas(boolean lectorTarjetas) {
        this.lectorTarjetas = lectorTarjetas;
    }

    public boolean isWebCam() {
        return webCam;
    }

    public void setWebCam(boolean webCam) {
        this.webCam = webCam;
    }

    public boolean isPuertoHDMI() {
        return puertoHDMI;
    }

    public void setPuertoHDMI(boolean puertoHDMI) {
        this.puertoHDMI = puertoHDMI;
    }

    public Bateria getTipoBateria() {
        return tipoBateria;
    }

    public void setTipoBateria(Bateria tipoBateria) {
        this.tipoBateria = tipoBateria;
    }

    public Teclado getTipoTeclado() {
        return tipoTeclado;
    }

    public void setTipoTeclado(Teclado tipoTeclado) {
        this.tipoTeclado = tipoTeclado;
    }

    //CLASE BUILDER
    public static class Builder {

        private Long id;
        private String tipo;
        private String marca;
        private String sistemaOperativo;
        private int pulgadasPantalla;
        private int numeroDeUsbs;
        private boolean dvd;
        private boolean lectorTarjetas;
        private boolean webCam;
        private boolean puertoHDMI;
        Bateria tipoBateria;
        Teclado tipoTeclado;


        Ordenador build() {

            return new Ordenador(this.id, this.tipo, this.marca, this.sistemaOperativo, this.pulgadasPantalla,
                    this.numeroDeUsbs, this.dvd, this.lectorTarjetas, this.webCam, this.puertoHDMI, this.tipoBateria,
                    this.tipoTeclado);
        }

        public Long getId() {
            return id;
        }

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

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setTipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder setMarca(String marca) {
            this.marca = marca;
            return this;
        }

        public Builder setSistemaOperativo(String sistemaOperativo) {
            this.sistemaOperativo = sistemaOperativo;
            return this;
        }

        public Builder setPulgadasPantalla(int pulgadasPantalla) {
            this.pulgadasPantalla = pulgadasPantalla;
            return this;
        }

        public Builder setNumeroDeUsbs(int numeroDeUsbs) {
            this.numeroDeUsbs = numeroDeUsbs;
            return this;
        }

        public Builder setDvd(boolean dvd) {
            this.dvd = dvd;
            return this;
        }

        public Builder setLectorTarjetas(boolean lectorTarjetas) {
            this.lectorTarjetas = lectorTarjetas;
            return this;
        }

        public Builder setWebCam(boolean webCam) {
            this.webCam = webCam;
            return this;
        }

        public Builder setPuertoHDMI(boolean puertoHDMI) {
            this.puertoHDMI = puertoHDMI;
            return this;
        }

        public Builder setTipoBateria(Bateria tipoBateria) {
            this.tipoBateria = tipoBateria;
            return this;
        }

        public Builder setTipoTeclado(Teclado tipoTeclado) {
            this.tipoTeclado = tipoTeclado;
            return this;
        }
    }
}
