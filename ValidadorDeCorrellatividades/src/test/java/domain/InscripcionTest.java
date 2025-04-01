package domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {
    @Test

    void inscripcionEsAprobadaSiFueAprobada() {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setFueAprobada(true);

        Assertions.assertTrue(inscripcion.aprobada());
    }

    @Test

    void inscripcionNoEsAprobadaSiNoFueAprobada() {
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.setFueAprobada(false);

        Assertions.assertFalse(inscripcion.aprobada());
    }

}