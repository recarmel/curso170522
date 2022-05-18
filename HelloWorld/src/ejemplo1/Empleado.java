package ejemplo1;

public class Empleado extends Persona {
    private int idEmpleado;
    private int sueldo;

    public Empleado(int idPersona, String nombre, String apellido, int edadPersona, int idEmpleado, int sueldo){
        super(idPersona,nombre, apellido,edadPersona);
        this.idEmpleado = idEmpleado;
        this.sueldo = sueldo;

    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
}
