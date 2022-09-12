package singleton;

public class Gerente {

    private String nombre;
    private String apellidos;
    private String dirección;
    private String email;
    private int edad;

    private static Gerente gerenteInstance;


    private Gerente() {}


    public static Gerente getInstance() {
        if (gerenteInstance == null)
            gerenteInstance = new Gerente();

        return gerenteInstance;
    }

    public void visualizarDatosGerente() {
        System.out.println("nombre: " + getNombre());
        System.out.println("apellidos: " + getApellidos());
        System.out.println("direccion: " + getDirección());
        System.out.println("email: " + getEmail());
        System.out.println("edad: " + getEdad());
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
