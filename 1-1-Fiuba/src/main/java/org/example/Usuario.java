package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private final String nombre;
    private final Map<String, ProgresoCarrera> carrerasInscritas;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.carrerasInscritas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void inscribirCarrera(Carrera carrera) {
        carrerasInscritas.putIfAbsent(carrera.getCodigo(), new ProgresoCarrera(carrera));
    }

    public void aprobarMateria(String codigoCarrera, String codigoMateria) {
        ProgresoCarrera progreso = obtenerProgreso(codigoCarrera);
        progreso.aprobarMateria(codigoMateria);
    }

    public EstadoCarrera consultarEstado(String codigoCarrera) {
        ProgresoCarrera progreso = obtenerProgreso(codigoCarrera);
        return progreso.obtenerEstado();
    }

    public Map<String, ProgresoCarrera> getCarrerasInscritas() {
        return Collections.unmodifiableMap(carrerasInscritas);
    }

    private ProgresoCarrera obtenerProgreso(String codigoCarrera) {
        ProgresoCarrera progreso = carrerasInscritas.get(codigoCarrera);
        if (progreso == null) {
            throw new IllegalArgumentException("El usuario no esta inscripto en la carrera: " + codigoCarrera);
        }
        return progreso;
    }
}
