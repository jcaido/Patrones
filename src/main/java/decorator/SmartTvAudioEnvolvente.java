package decorator;

public class SmartTvAudioEnvolvente extends TvDecorator{

    public SmartTvAudioEnvolvente(Televisor televisor) {
        super(televisor);
    }
    @Override
    public String mostrarTelevisor() {

        this.televisor.setMarca("Sangsung");
        this.televisor.setPulgadas(("40"));
        this.televisor.setPantallaPlana(true);
        this.televisor.setConexionInternet(true);
        this.televisor.setSonido("Sonido envolvente");

        return this.televisor.mostrarTelevisor() + " + TvBox";
    }

    @Override
    public double precio() {

        return this.televisor.precio() + 50;
    }
}
