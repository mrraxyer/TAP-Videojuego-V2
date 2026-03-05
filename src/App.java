import Views.VistaConsola;
import Controllers.PersonajesController;

public class App {
        public static void main(String[] args) {
                VistaConsola vista = new VistaConsola();
                PersonajesController controller = new PersonajesController(vista);

                vista.mostrarTitulo("Sistema de Creacion de Personajes");

                var guerrero = controller.crearGuerrero();
                controller.mostrarFichaPersonaje(guerrero);
                controller.ejecutarHabilidades(guerrero);

                var mago = controller.crearMago();
                controller.mostrarFichaPersonaje(mago);
                controller.ejecutarHabilidades(mago);

                var guerreroCompleto = controller.crearGuerreroCompleto();
                controller.mostrarFichaPersonaje(guerreroCompleto);
                controller.ejecutarHabilidades(guerreroCompleto);

                var arqueroCompleto = controller.crearArqueroCompleto();
                controller.mostrarFichaPersonaje(arqueroCompleto);
                controller.ejecutarHabilidades(arqueroCompleto);
        }
}
