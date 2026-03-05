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

    public Personaje crearGuerrero() {
        vista.mostrarMensaje("Creando un Guerrero...");
        PersonajeBuilder<?> guerreroBuilder = PersonajeFactory.crearBuilder("guerrero");
        Personaje guerrero = guerreroBuilder
                .agregarHabilidad(new AtaqueEspadazo())
                .agregarHabilidad(new DefensaEscudo())
                .setFuerza(80)
                .setInteligencia(40)
                .setVelocidad(60)
                .setResistencia(70)
                .obtenerPersonaje();
        return guerrero;
    }

    public Personaje crearMago() {
        vista.mostrarMensaje("Creando un Mago...");
        PersonajeBuilder<?> magoBuilder = PersonajeFactory.crearBuilder("mago");
        Personaje mago = magoBuilder
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .agregarHabilidad(new CuracionMagica())
                .setFuerza(40)
                .setInteligencia(80)
                .setVelocidad(50)
                .setResistencia(30)
                .obtenerPersonaje();
        return mago;
    }

    public Personaje crearGuerreroCompleto() {
        vista.mostrarMensaje("Creando un Guerrero Completo...");
        Personaje guerreroCompleto = PersonajeFactory.crearBuilder("guerrero")
                .agregarHabilidad(new AtaqueEspadazo())
                .agregarHabilidad(new DefensaEscudo())
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .agregarHabilidad(new CuracionMagica())
                .setFuerza(80)
                .setInteligencia(40)
                .setVelocidad(60)
                .setResistencia(70)
                .obtenerPersonaje();
        return guerreroCompleto;
    }

    public Personaje crearArqueroCompleto() {
        vista.mostrarMensaje("Creando un Arquero Completo...");
        Personaje arqueroCompleto = PersonajeFactory.crearBuilder("arquero")
                .setFuerza(60)
                .setInteligencia(50)
                .setVelocidad(80)
                .setResistencia(40)
                .obtenerPersonaje();
        return arqueroCompleto;
    }
}