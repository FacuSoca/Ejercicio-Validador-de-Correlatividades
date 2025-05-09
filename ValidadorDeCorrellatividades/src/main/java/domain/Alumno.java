package domain;

import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public void agregarMateriaAprobada(Materia materia){
        materiasAprobadas.add(materia);
    }

    public Set<Materia> getMateriasAprobadas(){
        return materiasAprobadas;
    }
}
