public class mains {
    
    public static void main(String[] args) {
        docente tichers=new docente("Cuitla", "maistro", 935);
        tichers.getNoEmpleado();
        System.out.println(tichers.getNoEmpleado());
        tichers.getNombre();
        System.out.println(tichers.getNombre());
        tichers.getRol();
        System.out.println(tichers.getRol());


        alumno morrillo=new alumno("Juanillo", "Alumnito", "2530831",213564890);
        morrillo.getMatricula();
        System.out.println(morrillo.getMatricula());
        morrillo.getNombre();
        System.out.println(morrillo.getNombre());
        morrillo.getRol();
        System.out.println(morrillo.getRol());
        morrillo.getQR();
        System.out.println(morrillo.getQR());
    }
}
