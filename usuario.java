public class usuario {
    protected String nombre;
    protected String rol;

    public usuario(String nombre, String rol){
        this.nombre=nombre;
        this.rol=rol;
    }

    public String getNombre(){
        return nombre;
    }

    public String getRol(){
        return rol;
    }
    
}
