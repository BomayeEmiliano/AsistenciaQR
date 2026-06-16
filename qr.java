public class qr {
    
    private qr codigoQR;

    public qr(qr codigoQR)
    {
        this.codigoQR=codigoQR;
    }

    public qr getQR(){
        return codigoQR;
    }

    public boolean validar(String codigoIngresado)
    {
        return codigoQR.equals(codigoIngresado);
    }
}
