package org.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SistemaCarreras {
    private final Map<String, Carrera> carreras;
    private final Map<String, Usuario> usuarios;

    public SistemaCarreras() {
        this.carreras = new HashMap<>();
        this.usuarios = new HashMap<>();
    }

    public void registrarCarrera(Carrera carrera) {
        carreras.put(carrera.getCodigo(), carrera);
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.put(usuario.getNombre(), usuario);
    }

    public void inscribirUsuarioEnCarrera(String nombreUsuario, String codigoCarrera) {
        Usuario usuario = obtenerUsuario(nombreUsuario);
        Carrera carrera = obtenerCarrera(codigoCarrera);
        usuario.inscribirCarrera(carrera);
    }

    public void aprobarMateria(String nombreUsuario, String codigoCarrera, String codigoMateria) {
        Usuario usuario = obtenerUsuario(nombreUsuario);
        usuario.aprobarMateria(codigoCarrera, codigoMateria);
    }

    public EstadoCarrera consultarEstadoCarrera(String nombreUsuario, String codigoCarrera) {
        Usuario usuario = obtenerUsuario(nombreUsuario);
        return usuario.consultarEstado(codigoCarrera);
    }

    public Map<String, Carrera> getCarreras() {
        return Collections.unmodifiableMap(carreras);
    }

    public Map<String, Usuario> getUsuarios() {
        return Collections.unmodifiableMap(usuarios);
    }

    private Usuario obtenerUsuario(String nombreUsuario) {
        Usuario usuario = usuarios.get(nombreUsuario);
        if (usuario == null) {
            throw new IllegalArgumentException("Usuario inexistente: " + nombreUsuario);
        }
        return usuario;
    }

    private Carrera obtenerCarrera(String codigoCarrera) {
        Carrera carrera = carreras.get(codigoCarrera);
        if (carrera == null) {
            throw new IllegalArgumentException("Carrera inexistente: " + codigoCarrera);
        }
        return carrera;
    }
}
