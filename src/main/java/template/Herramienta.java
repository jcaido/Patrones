package template;

public abstract class Herramienta {


    public String crearHerramienta() {

        return crearSoporte() + " -> " + insertarMarca() + " -> "
                + crearUtilFuncional() + " -> " + ensamblarHerramienta() + " -> Herramienta disponible";
    }



    public String crearSoporte() {

        return "Soporte de madera fabricado";
    }

    public String insertarMarca() {

        return "Marca insertada en el soporte";
    }

    public abstract String crearUtilFuncional();

    public String ensamblarHerramienta() {

        return "Herramianta ensamblada";
    }
}
