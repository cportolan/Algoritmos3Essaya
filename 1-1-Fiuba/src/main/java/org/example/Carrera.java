package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Carrera {
    private final String nombre;
    private final String codigo;
    private final List<Materia> materias;
    private final int creditosNecesarios;

    public Carrera(String nombre, String codigo, List<Materia> materias, int creditosNecesarios) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materias = new ArrayList<>(materias);
        this.creditosNecesarios = creditosNecesarios;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getCreditosNecesarios() {
        return creditosNecesarios;
    }

    public List<Materia> getMaterias() {
        return Collections.unmodifiableList(materias);
    }

    public List<Materia> getMateriasObligatorias() {
        List<Materia> resultado = new ArrayList<>();
        for (Materia materia : materias) {
            if (materia.esObligatoria()) {
                resultado.add(materia);
            }
        }
        return resultado;
    }

    public List<Materia> getMateriasOptativas() {
        List<Materia> resultado = new ArrayList<>();
        for (Materia materia : materias) {
            if (!materia.esObligatoria()) {
                resultado.add(materia);
            }
        }
        return resultado;
    }

    public Optional<Materia> buscarMateriaPorCodigo(String codigoMateria) {
        for (Materia materia : materias) {
            if (materia.getCodigo().equals(codigoMateria)) {
                return Optional.of(materia);
            }
        }
        return Optional.empty();
    }
}
