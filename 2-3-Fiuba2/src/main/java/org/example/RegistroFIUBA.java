package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RegistroFIUBA {
    private final Map<Integer, Integrante> porDni = new HashMap<>();
    private final Map<Integer, Alumno> alumnosPorPadron = new HashMap<>();
    private final Map<Integer, Docente> docentesPorLegajo = new HashMap<>();

    public void agregarAlumno(String nombre, int dni, int padron) {
        validarDniDisponible(dni);
        if (alumnosPorPadron.containsKey(padron)) {
            throw new IllegalArgumentException("Ya existe un alumno con ese padron: " + padron);
        }
        Alumno alumno = new Alumno(nombre, dni, padron);
        porDni.put(dni, alumno);
        alumnosPorPadron.put(padron, alumno);
    }

    public void agregarDocente(String nombre, int dni, int legajo) {
        validarDniDisponible(dni);
        if (docentesPorLegajo.containsKey(legajo)) {
            throw new IllegalArgumentException("Ya existe un docente con ese legajo: " + legajo);
        }
        Docente docente = new Docente(nombre, dni, legajo);
        porDni.put(dni, docente);
        docentesPorLegajo.put(legajo, docente);
    }

    public List<Alumno> listarAlumnos() {
        return new ArrayList<>(alumnosPorPadron.values());
    }

    public List<Docente> listarDocentes() {
        return new ArrayList<>(docentesPorLegajo.values());
    }

    private void validarDniDisponible(int dni) {
        if (porDni.containsKey(dni)) {
            throw new IllegalArgumentException("Ya existe un integrante con ese DNI: " + dni);
        }
    }
}
