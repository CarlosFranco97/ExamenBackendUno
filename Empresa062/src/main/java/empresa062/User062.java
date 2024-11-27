package empresa062;

public class User062 {
    private String nombre;
    private String email;
    private String rol;

    public String getterNombre(){
        return this.nombre;
    }

    public void setterNombre(String nombre){
        this.nombre = nombre;
    }

    public String getterEmail(){
        return this.email;
    }

    public void setterEmail(String email){
        this.email = email;
    }

    public String getterRol(){
        return this.rol;
    }

    public void setterRol(String rol){
        this.rol = rol;
    }


    public String obtenerDetalles(){
        return "nombre: " + nombre + "\n" + "email: " + email + "rol: " + rol;
    }
}
