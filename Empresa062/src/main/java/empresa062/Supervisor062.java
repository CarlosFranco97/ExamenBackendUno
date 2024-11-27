package empresa062;

public class Supervisor062 extends User062 {

    /* metodo constructor */
    public void Supervisor062(){

    }
    public void Supervisor062(String nombre, String email, String rol) {

    }

    public String obtenerDetalles() {
        super.obtenerDetalles();
        return "nombre del supervisor: " + getterNombre() + " email del supervisor " + getterEmail() + " rol de supervisor " + getterRol();
    }
}
