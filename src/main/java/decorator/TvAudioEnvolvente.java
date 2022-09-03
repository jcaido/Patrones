package decorator;

public class TvAudioEnvolvente extends TvDecorator{

    public TvAudioEnvolvente(Televisor televisor) {
        super(televisor);
    }

    @Override
    public String mostrarTelevisor() {

        this.televisor.setMarca("Sangsung");
        this.televisor.setPulgadas(("40"));
        this.televisor.setPantallaPlana(true);
        this.televisor.setConexionInternet(false);
        this.televisor.setSonido("Sonido envolvente");

        return this.televisor.mostrarTelevisor() + " + Sonido envolvente";

    }

    @Override
    public double precio() {

        return this.televisor.precio() + 150;
    }
}
