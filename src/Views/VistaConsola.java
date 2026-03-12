package Views;

import Models.Personaje;

public class VistaConsola {
    private static final String SEPARADOR = "-------";

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarTitulo(String titulo) {
        System.out.println("\n" + titulo);
        System.out.println(SEPARADOR);
    }

    public void mostrarFicha(Personaje personaje) {
        System.out.println(personaje.mostrarFicha());
    }

    public void mostrarHabilidades(Personaje personaje) {
        System.out.println(personaje.ejecutarHabilidades());
    }
}
