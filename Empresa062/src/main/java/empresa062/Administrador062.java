package empresa062;

public class Administrador062 extends User062 {

     public String obtenerDetalles(){
        super.obtenerDetalles();
        return "nombre del administrador: " + getterNombre() + " email del administrador " + getterEmail() + " rol de administrador " + getterRol();
    }
}
