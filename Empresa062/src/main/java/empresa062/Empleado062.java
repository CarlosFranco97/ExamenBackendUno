package empresa062;

public class Empleado062 extends User062 {


    public void Empleado(){

    }

    public void Empleado(String nombre, String email, String rol){

    }


    @Override
    public String obtenerDetalles() {
        super.obtenerDetalles();
        return "nombre del empleado: " + getterNombre() + " email del empleado " + getterEmail() + " rol de empleado " + getterRol();
    }


}
