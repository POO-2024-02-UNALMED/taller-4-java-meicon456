package classroom;

public class Persona {

    public String nombre;
    public int cedula;

    public Persona() {
        this.nombre = "Sin nombre";
        this.cedula = 0;
    }

    public Persona(int cedula) {
        this.nombre = "Sin nombre";
        this.cedula = cedula;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        this.cedula = 0;
    }

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public int getCedula() {
        return this.cedula;
    }
}
