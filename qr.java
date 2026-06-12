public class qr {
    
    private String codigoQR;

    public qr(String codigoQR)
    {
        this.codigoQR=codigoQR;
    }

    public String getQR(){
        return codigoQR;
    }

    public boolean validar(String codigoIngresado)
    {
        return codigoQR.equals(codigoIngresado);
    }
}
