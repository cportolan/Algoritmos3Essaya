package org.example;

public class Mensaje {
    // Atributos
    private final Usuario usuarioEmisor;
    private final Usuario usuarioDestinatario;
    private final String texto;

    // Inicializo
    public Mensaje(String texto, Usuario usuarioEmisor, Usuario usuarioDestinatario) {
        this.texto = texto;
        this.usuarioEmisor; usuarioEmisor;
        this.usuarioDestinatario = usuarioDestinatario;
    }

    // Metodos
    public String getTexto() {
        return texto;
    }
    public Usuario getUsuarioEmisor() {
        return usuarioEmisor;
    }
    public Usuario getUsuarioDestinatario() {
        return usuarioDestinatario;
    }
}
