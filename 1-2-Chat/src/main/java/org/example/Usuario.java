package org.example;

import java.util.List;
import java.util.ArrayList;
import java.util.

public class Usuario {
    // Atributos
    private final String nombre;
    private final List<Mensaje> mensajesEnviados;
    private final List<Mensaje> mensajesRecibidos;

    // Inicializo
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.mensajesEnviados = new ArrayList<>()
        this.mensajesRecibidos = new ArrayList<>()
    }

    // Metodos
    public String getNombre() {
        return nombre;
    }
    public List<Mensaje> getMensajesEnviados() {
        return mensajesEnviados;
    }
    public List<Mensaje> getMensajesRecibidos() {
        return mensajesRecibidos;
    }
    public void enviarMensaje(String texto, Usuario destinatario) {
        Mensaje mensaje = new Mensaje(texto, this, destinatario);
        mensajesEnviados.add(mensaje);
        destinatario.recibirMensaje(mensaje);
    }
    private void recibirMensaje(Mensaje mensaje) {
        mensajesRecibidos.add(mensaje);
    }
}
