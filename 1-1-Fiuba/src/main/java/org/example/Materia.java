package org.example;

public class Materia {
    private final String codigo;
    private final String nombre;
    private final int creditos;
    private final TipoMateria tipo;

    // Constructor de la Clase: Materia
    public Materia(String codigo, String nombre, int creditos, TipoMateria tipo) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.creditos = creditos;
        this.tipo = tipo;
    }

    // Métodos de la Clase: Materia
    public String getCodigo() {
        return codigo;
    }
    public int getCreditos() {
        return creditos;
    }
    public TipoMateria getTipo() {
        return tipo;
    }
    public boolean esObligatoria() {
        return tipo == TipoMateria.OBLIGATORIA;
    }
    public void printMateria() {
        System.out.printf("Nombre de la materia: " + nombre);
        System.out.printf("Código de la materia: " + codigo);
        System.out.printf("Créditos otorgados: " + creditos);
    }
}
