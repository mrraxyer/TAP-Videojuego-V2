package Controllers;

import Views.VistaConsola;
import Models.Personaje;
import Utils.Builders.PersonajeBuilder;
import Utils.Factories.PersonajeFactory;
import Stategies.*;

public class PersonajesController {
    private VistaConsola vista;

    public PersonajesController(VistaConsola vista) {
        this.vista = vista;
    }

    public Personaje generarPersonaje(String tipo) {
        try {
            PersonajeBuilder<?> builder = PersonajeFactory.crearBuilder(tipo);
            Personaje personaje = builder.obtenerPersonaje();
            vista.mostrarMensaje(tipo + " generado con éxito.");
            return personaje;
        } catch (IllegalArgumentException e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
            return null;
        }
    }

    public void agregarHabilidad(Personaje personaje, HabilidadStrategy habilidad) {
        if (personaje != null && habilidad != null) {
            personaje.agregarHabilidad(habilidad);
        }
    }

    public void mostrarFichaPersonaje(Personaje personaje) {
        if (personaje != null) {
            vista.mostrarFicha(personaje);
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }

    public void ejecutarHabilidades(Personaje personaje) {
        if (personaje != null) {
            vista.mostrarHabilidades(personaje);
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }

    public void ejecutarHabilidad(Personaje personaje, String nombre) {
        if (personaje != null) {
            vista.mostrarMensaje(personaje.ejecutarHabilidad(nombre));
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }
}