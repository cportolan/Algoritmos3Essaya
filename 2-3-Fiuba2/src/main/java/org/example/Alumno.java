package org.example;

// Los alumnos tienen número de padrón o legajo. No puede haber dos alumnos con el mismo número de padrón.

public class Alumno extends Integrante {
    private final int padron;

    public Alumno(String nombre, int documento, int padron) {
        super(nombre, documento);
        this.padron = padron;
    }

    public int getPadron() {
        return padron;
    }

    @Override
    public String getIntegranteInfo() {
        return super.getIntegranteInfo() + ", Padrón: " + padron;
    }
}
