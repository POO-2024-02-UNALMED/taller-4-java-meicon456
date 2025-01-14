package classroom;

public class Persona {
    public String nombre;
    public int cedula;

    public Persona(String nombre, int cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Persona(int cedula) {
        this("Sin nombre", cedula);
    }

    public Persona(String nombre) {
        this(nombre, 1);
    }

    public Persona(int cedula, String nombre) {
        this.cedula = cedula;
        this.nombre = nombre;
    }

    public Persona() {
        this("Sin nombre", 0);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getCedula() {
        return cedula;
    }
}

