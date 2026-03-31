package org.example;

// Cualquier integrante de FIUBA tiene un nombre y DNI. No puede haber dos personas con el mismo DNI. Un integrante puede ser alumno o docente.
// El sistema debe permitir: cargar un nuevo integrante, listar todos los alumnos (con todos sus datos), listar todos los docentes (con todos sus datos).

public class Integrante {
    private final String nombre;
    private final int documento;

    public Integrante(String nombre, int documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumento() {
        return documento;
    }

    public String getIntegranteInfo() {
        return "Nombre: " + nombre + ", Documento: " + documento;
    }
}
