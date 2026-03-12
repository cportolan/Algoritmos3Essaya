package org.example;

public class EstadoCarrera {
    private final String codigoCarrera;
    private final int creditosAprobados;
    private final int creditosNecesarios;
    private final boolean obligatoriasAprobadas;
    private final boolean creditosCumplidos;

    public EstadoCarrera(String codigoCarrera, int creditosAprobados, int creditosNecesarios,
                         boolean obligatoriasAprobadas, boolean creditosCumplidos) {
        this.codigoCarrera = codigoCarrera;
        this.creditosAprobados = creditosAprobados;
        this.creditosNecesarios = creditosNecesarios;
        this.obligatoriasAprobadas = obligatoriasAprobadas;
        this.creditosCumplidos = creditosCumplidos;
    }

    public String getCodigoCarrera() {
        return codigoCarrera;
    }

    public int getCreditosAprobados() {
        return creditosAprobados;
    }

    public int getCreditosNecesarios() {
        return creditosNecesarios;
    }

    public boolean isObligatoriasAprobadas() {
        return obligatoriasAprobadas;
    }

    public boolean isCreditosCumplidos() {
        return creditosCumplidos;
    }

    public boolean isFinalizada() {
        return obligatoriasAprobadas && creditosCumplidos;
    }
}
