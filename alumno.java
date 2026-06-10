public class alumno extends usuario {
    
    private String matricula;
    private int qr;

    public alumno(String nombre, String rol, String matricula, int qr)
    {
        super(nombre, rol);
        this.matricula=matricula;
        this.qr=qr;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public int getQR()
    {
        return qr;
    }

}
