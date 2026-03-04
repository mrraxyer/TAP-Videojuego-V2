import Utils.Factories.PersonajeFactory;
import Models.Personaje;
import Utils.Builders.PersonajeBuilder;
import Stategies.*;
import Views.VistaConsola;

public class App {
    public static void main(String[] args) {
        VistaConsola vista = new VistaConsola();

        vista.mostrarTitulo("Sistema de Creacion de Personajes");
        vista.mostrarLineaVacia();

        vista.mostrarMensaje("Creando un Guerrero...");
        PersonajeBuilder<?> guerreroBuilder = PersonajeFactory.crearBuilder("guerrero");
        Personaje guerrero = guerreroBuilder
                .agregarHabilidad(new AtaqueEspadazo())
                .agregarHabilidad(new DefensaEscudo())
                .obtenerPersonaje();

        guerrero.mostrarFicha();
        guerrero.ejecutarHabilidades();

        vista.mostrarSeparador();
        vista.mostrarLineaVacia();

        vista.mostrarMensaje("Creando un Mago...");
        PersonajeBuilder<?> magoBuilder = PersonajeFactory.crearBuilder("mago");
        Personaje mago = magoBuilder
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .agregarHabilidad(new CuracionMagica())
                .obtenerPersonaje();

        mago.mostrarFicha();
        mago.ejecutarHabilidades();

        vista.mostrarSeparador();
        vista.mostrarLineaVacia();

        vista.mostrarMensaje("Creando un Guerrero Completo...");
        Personaje guerreroCompleto = PersonajeFactory.crearBuilder("guerrero")
                .agregarHabilidad(new AtaqueEspadazo())
                .agregarHabilidad(new DefensaEscudo())
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .agregarHabilidad(new CuracionMagica())
                .obtenerPersonaje();

        guerreroCompleto.mostrarFicha();
        guerreroCompleto.ejecutarHabilidades();

        vista.mostrarTitulo("Fin del Programa");
    }
}
