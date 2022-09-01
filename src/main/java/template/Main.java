package template;

public class Main {

    public static void main(String[] args) {

        Pico picoA = new Pico();
        System.out.println(picoA.crearHerramienta());

        Pala palaA = new Pala();
        System.out.println(palaA.crearHerramienta());

        Mazo mazoA = new Mazo();
        System.out.println(mazoA.crearHerramienta());

    }
}
