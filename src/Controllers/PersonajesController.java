package Controllers;

import Models.Personaje;
import Stategies.*;
import Utils.Builders.PersonajeBuilder;
import Utils.Factories.PersonajeFactory;
import Views.VistaConsola;

public class PersonajesController {
    private VistaConsola vista;

    public PersonajesController(VistaConsola vista) {
        this.vista = vista;
    }

    // Metodo para generar un personaje utilizando factory y builder
    public Personaje generarPersonaje(String tipo) {
        try {
            // Se utliza la factory para obtener el builder corresponiente
            PersonajeBuilder<?> builder = PersonajeFactory.crearBuilder(tipo);
            // Se obtiene el personaje generado por el builder
            Personaje personaje = builder.obtenerPersonaje();
            vista.mostrarMensaje(tipo + " generado con éxito.");
            return personaje;
        } catch (IllegalArgumentException e) {
            vista.mostrarMensaje("Error: " + e.getMessage());
            return null;
        }
    }

    // Metodo para agregar habilidades a un persona
    public void agregarHabilidad(Personaje personaje, HabilidadStrategy habilidad) {
        // Se valida que el pesonaje y la habilidad no sea nulos antes de agregarlos
        if (personaje != null && habilidad != null) {
            personaje.agregarHabilidad(habilidad);
        }
    }

    // Metodo para mostrar la ficha del personaje
    public void mostrarFichaPersonaje(Personaje personaje) {
        // Se valida que el pesonaje no sea nulo antes de mostrar su ficha
        if (personaje != null) {
            vista.mostrarFicha(personaje);
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }

    // Metodo para ejecutar todas las habilidades del personaje
    public void ejecutarHabilidades(Personaje personaje) {
        if (personaje != null) {
            vista.mostrarHabilidades(personaje);
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }

    // Metodo para ejecutar una habilidad especifica del personaje
    public void ejecutarHabilidad(Personaje personaje, String nombre) {
        if (personaje != null) {
            vista.mostrarMensaje(personaje.ejecutarHabilidad(nombre));
        } else {
            vista.mostrarMensaje("Error: Personaje no existe.");
        }
    }
}