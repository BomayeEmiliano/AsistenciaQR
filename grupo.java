import java.util.ArrayList;
import java.util.List;

public class grupo {
    private String nombreGrupo;
    private List<alumno> alumnos;

    public grupo(String nombreGrupo)
    {
        this.nombreGrupo=nombreGrupo;
        this.alumnos=new ArrayList<>();
    }

    public void agregarAlumnos(alumno a)
    {
        alumnos.add(a);
    }

    public List<alumno> getAlumno()
    {
        return alumnos;
    }
}
