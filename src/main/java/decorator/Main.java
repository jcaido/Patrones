package decorator;

public class Main {

    public static void main(String[] args) {

        Televisor tvSalon = new TvEstandar();
        System.out.println(tvSalon.mostrarTelevisor() + " => precio = " + tvSalon.precio());

        //aplicamos primer decorador
        Televisor tvSalonAudio = new TvAudioEnvolvente(tvSalon);
        System.out.println(tvSalonAudio.mostrarTelevisor() + " => precio = " + tvSalonAudio.precio());

        //aplicamos segundo decorador
        Televisor tvSalonAudioSmart = new SmartTvAudioEnvolvente(tvSalonAudio);
        System.out.println(tvSalonAudioSmart.mostrarTelevisor() + " => precio = " + tvSalonAudioSmart.precio());


    }
}
