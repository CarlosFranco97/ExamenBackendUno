package empresa062;

public class Main062 {
    public static void main(String[] args) {
        /* Empleado */
        Empleado062 empleado = new Empleado062();
        empleado.setterNombre("Carlos");
        empleado.setterEmail("carlos@gmail.com");
        empleado.setterRol("Desarrollador");
        System.out.println(empleado.obtenerDetalles());

        /* Supervisor */
        Supervisor062 supervisor = new Supervisor062();
        supervisor.setterNombre("Raul");
        supervisor.setterEmail("raul@gmail.com");
        supervisor.setterRol("Supervisor planta desarrollo");
        System.out.println(supervisor.obtenerDetalles());

        /* Administrador */
        Administrador062 administrador = new Administrador062();
        administrador.setterNombre("Luis");
        administrador.setterEmail("luis@gmail.com");
        administrador.setterRol("administrador jefe");
        System.out.println(administrador.obtenerDetalles());
    }
}
