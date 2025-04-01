package domain;

import java.time.LocalDate;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasACursar;
    private boolean fueAprobada;
    private Alumno alumno;
    private LocalDate fechaDeEvaluacion;

    public boolean aprobada() {
        return false;
    }

    public void setFueAprobada(boolean b) {
    }
}
