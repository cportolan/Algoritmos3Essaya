package org.example;

import java.util.HashSet;
import java.util.Set;

public class ProgresoCarrera {
    private final Carrera carrera;
    private final Set<String> materiasAprobadas;

    public ProgresoCarrera(Carrera carrera) {
        this.carrera = carrera;
        this.materiasAprobadas = new HashSet<>();
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void aprobarMateria(String codigoMateria) {
        if (carrera.buscarMateriaPorCodigo(codigoMateria).isEmpty()) {
            throw new IllegalArgumentException("La materia no pertenece a la carrera: " + codigoMateria);
        }
        materiasAprobadas.add(codigoMateria);
    }

    public EstadoCarrera obtenerEstado() {
        int creditosAprobados = 0;
        boolean obligatoriasAprobadas = true;

        for (Materia materia : carrera.getMaterias()) {
            if (materiasAprobadas.contains(materia.getCodigo())) {
                creditosAprobados += materia.getCreditos();
            } else if (materia.esObligatoria()) {
                obligatoriasAprobadas = false;
            }
        }

        boolean creditosCumplidos = creditosAprobados >= carrera.getCreditosNecesarios();
        return new EstadoCarrera(
                carrera.getCodigo(),
                creditosAprobados,
                carrera.getCreditosNecesarios(),
                obligatoriasAprobadas,
                creditosCumplidos
        );
    }
}
