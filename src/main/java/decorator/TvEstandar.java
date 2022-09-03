package decorator;

public class TvEstandar extends Televisor{
    @Override
    public String mostrarTelevisor() {
        return "Televisor estandar";
    }

    @Override
    public double precio() {
        return 200;
    }
}
