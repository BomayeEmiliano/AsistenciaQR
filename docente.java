public class docente extends usuario {

    private int noEmpleado;

    public docente(String nombre, String rol, int noEmpleado)
    {
        super(nombre, rol);
        this.noEmpleado=noEmpleado;
    }

    public int getNoEmpleado()
    {
        return noEmpleado;
    }
}
