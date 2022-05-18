package ejemplo1;

public class EjecutarEjemplo1 {
    public static void main(String args[]) {
        Cliente c = new Cliente(1, "Melvin", "Cardona", 45, 1);
        System.out.println(c.toString());
        System.out.println(c.getContadorPersona());


        Empleado e1 = new Empleado(2, "melvin", "lopez", 30, 2, 3500);
        System.out.println("===========================");
        System.out.println(e1.toString());
        System.out.println(e1.getContadorPersona());

        Persona p1 = new Persona(30,"Maria", "Larios", 30);
        System.out.println("===========================");
        System.out.println(p1.toString());
        System.out.println(p1.getContadorPersona());



    }
}
