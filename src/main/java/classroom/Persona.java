package classroom;

public class Persona {

    public String nombre;
    public int cedula;

    public Persona() {
        this("Sin nombre", 0);
    }

    public Persona(int cedula) {
        this("Sin nombre", cedula);
    }

    public Persona(String nombre) {
        this(nombre, 0);
    }

    public Persona(int cedula, String nombre) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCedula() {
        return this.cedula;
    }
}
