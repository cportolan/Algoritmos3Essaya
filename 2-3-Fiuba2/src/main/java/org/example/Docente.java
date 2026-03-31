package org.example;

// Los docentes también tienen un número de legajo (independiente del de los alumnos). No puede haber dos docentes con el mismo número de legajo.

public class Docente extends Integrante {
    private final int legajo;

    public Docente(String nombre, int documento, int legajo) {
        super(nombre, documento);
        this.legajo = legajo;
    }

    public int getLegajo() {
        return legajo;
    }

    @Override
    public String getIntegranteInfo() {
        return super.getIntegranteInfo() + ", Legajo: " + legajo;
    }
}
