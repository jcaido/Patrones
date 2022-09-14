package abstractFactory;

public abstract class SmartTv {

    private String marca;
    private String modelo;
    private String pulgadas;
    private String sistemaOperativo;

    public SmartTv(String marca, String modelo, String pulgadas, String sistemaOperativo) {
        this.marca = marca;
        this.modelo = modelo;
        this.pulgadas = pulgadas;
        this.sistemaOperativo = sistemaOperativo;
    }

    public abstract void mostrarTv();

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(String pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }
}
