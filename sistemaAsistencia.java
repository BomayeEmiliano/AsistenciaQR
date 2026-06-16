import java.util.List;
import java.util.ArrayList;

public class sistemaAsistencia {
    
    private List<alumno> alumnos;
    private List<asistencia> asistencias;

    public sistemaAsistencia(){
        alumnos=new ArrayList<>();
        asistencias=new ArrayList<>();
    }

    public void registrarAlumno(alumno alum){
        alumnos.add(alum);
    }

    public alumno buscarAlumno(String matricula){
        for (alumno a : alumnos) {
            if (a.getMatricula().equals(matricula)) {
                return a;
            }
        }
        return null;
    }

    public void registrarAsistencia(String codigoQR){
        for (alumno a : alumnos) {
            if (a.getQR().validar(codigoQR)) {
                asistencia asis=new asistencia(a);
                asistencias.add(asis);

                System.out.println("Asistencia Registrada:"+a.getNombre());
                return;
            }
        }
        System.out.println("El QR no es valido");
    }

    public List<asistencia> getAsistencias(){
        return asistencias;
    }

}
