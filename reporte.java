import java.util.List;

public class reporte {
    public void generar(List<asistencia> asistencias){
        System.out.println("=== REPORTE DE ASISTENCIA ===");
        for (asistencia asis : asistencias) {
            asis.mostrarAsistencia();
        }

    }
}
