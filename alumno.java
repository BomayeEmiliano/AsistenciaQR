public class alumno extends usuario {
    
    private String matricula;
    private qr qr;

    public alumno(String nombre, String rol, String matricula, qr qr)
    {
        super(nombre, rol);
        this.matricula=matricula;
        this.qr=qr;
    }

    public String getMatricula()
    {
        return matricula;
    }

    public qr getQR()
    {
        return qr;
    }

}
