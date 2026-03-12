import Views.VistaConsola;
import Controllers.PersonajesController;

public class App {
        public static void main(String[] args) {
                VistaConsola vista = new VistaConsola();
                PersonajesController controller = new PersonajesController(vista);

                vista.mostrarTitulo("Sistema de Creacion de Personajes");

                var guerrero = controller.generarPersonaje("guerrero");
                controller.mostrarFichaPersonaje(guerrero);
                controller.ejecutarHabilidades(guerrero);

                var mago = controller.generarPersonaje("mago");
                controller.mostrarFichaPersonaje(mago);
                controller.ejecutarHabilidades(mago);

                var arquero = controller.generarPersonaje("arquero");
                controller.mostrarFichaPersonaje(arquero);
                controller.ejecutarHabilidades(arquero);

                var paladin = controller.generarPersonaje("paladin");
                controller.mostrarFichaPersonaje(paladin);
                controller.ejecutarHabilidades(paladin);
        }
}
