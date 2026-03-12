import Controllers.PersonajesController;
import Views.VistaConsola;

public class App {
        public static void main(String[] args) {
                // Se crea la vista y el controlador para la logica de personajes
                VistaConsola vista = new VistaConsola();
                PersonajesController controller = new PersonajesController(vista);

                vista.mostrarTitulo("Sistema de Creacion de Personajes");

                // Se generan los personajes utlizando el controlador mostrando sus metodos
                var guerrero = controller.generarPersonaje("guerrero");
                controller.mostrarFichaPersonaje(guerrero);
                controller.ejecutarHabilidades(guerrero);

                var mago = controller.generarPersonaje("mago");
                controller.mostrarFichaPersonaje(mago);
                controller.ejecutarHabilidades(mago);

                var arquero = controller.generarPersonaje("arquero");
                controller.mostrarFichaPersonaje(arquero);
                controller.ejecutarHabilidades(arquero);
                controller.ejecutarHabilidad(arquero, "DisparoPreciso");

                var paladin = controller.generarPersonaje("paladin");
                controller.mostrarFichaPersonaje(paladin);
                controller.ejecutarHabilidades(paladin);
                controller.ejecutarHabilidad(paladin, "EscudoSagrado");
        }
}
