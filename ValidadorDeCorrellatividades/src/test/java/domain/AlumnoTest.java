package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class AlumnoTest {
    @Test

    public void alumnoPuedeAgregarMateriasAprobadas() {
        Alumno alumno = new Alumno();
        Materia matematica = new Materia();

        alumno.agregarMateriaAprobada( matematica );

        Assertions.assertTrue(alumno.getMateriasAprobadas().contains( matematica ) );
    }
}