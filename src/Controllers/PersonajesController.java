package Controllers;

import Views.VistaConsola;
import Models.Personaje;
import Utils.Builders.PersonajeBuilder;
import Utils.Factories.PersonajeFactory;
import Stategies.HabilidadStrategy;

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
            vista.mostrarMensaje("Habilidad agregada al personaje.");
        }
    }

    public void mostrarFichaPersonaje(Personaje personaje) {
        if (personaje != null) {
            personaje.mostrarFicha();
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }

    public void ejecutarHabilidades(Personaje personaje) {
        if (personaje != null) {
            personaje.ejecutarHabilidades();
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }
}