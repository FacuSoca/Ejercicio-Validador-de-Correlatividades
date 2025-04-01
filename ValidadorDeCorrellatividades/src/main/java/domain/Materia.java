package domain;

import java.util.Set;

public class Materia {
    private String nombre;

    public Set<Materia> getCorrelativas() {
        return correlativas;
    }

    private Set<Materia> correlativas;

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadas){
        return materiasAprobadas.containsAll(this.correlativas);
    }

    public Set<Materia> getMateriasAprobadas(){
        return correlativas;
    }
}
