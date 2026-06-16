import java.util.Date;

public class asistencia {
    private alumno nombreAlumno;
    private Date fecha;

    public asistencia(alumno nombreAlumno)
    {
        this.nombreAlumno=nombreAlumno;
        this.fecha=new Date();
    }

    public void mostrarAsistencia()
    {
        System.out.println(nombreAlumno.getNombre()+" "+nombreAlumno.getMatricula()+" "+fecha);
    }
}
