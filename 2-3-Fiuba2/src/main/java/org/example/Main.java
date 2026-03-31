package org.example;

/*
Diseñar el modelo de objetos e implementar un sistema que funcione como un registro de todos los alumnos y docentes de la FIUBA.

Cualquier integrante de FIUBA tiene un nombre y DNI. No puede haber dos personas con el mismo DNI. Un integrante puede ser alumno o docente.

Los alumnos tienen número de padrón o legajo. No puede haber dos alumnos con el mismo número de padrón.

Los docentes también tienen un número de legajo (independiente del de los alumnos). No puede haber dos docentes con el mismo número de legajo.

El sistema debe permitir: cargar un nuevo integrante, listar todos los alumnos (con todos sus datos), listar todos los docentes (con todos sus datos).

*/


public class Main {
    public static void main(String[] args) {
        RegistroFIUBA registro = new RegistroFIUBA();

        registro.agregarAlumno("Ana Perez", 30111222, 1001);
        registro.agregarAlumno("Bruno Diaz", 28999888, 1002);
        registro.agregarDocente("Carla Soto", 22111333, 5001);

        System.out.println("Alumnos:");
        for (Alumno alumno : registro.listarAlumnos()) {
            System.out.println(alumno.getIntegranteInfo());
        }

        System.out.println("Docentes:");
        for (Docente docente : registro.listarDocentes()) {
            System.out.println(docente.getIntegranteInfo());
        }
    }
}
