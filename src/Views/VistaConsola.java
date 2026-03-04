package Views;

public class VistaConsola {
    private static final String SEPARADOR = "-------";

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarSeparador() {
        System.out.println(SEPARADOR);
    }

    public void mostrarTitulo(String titulo) {
        System.out.println("\n" + titulo);
        System.out.println(SEPARADOR);
    }

    public void mostrarAtributo(String nombre, Object valor) {
        System.out.println(nombre + ": " + valor);
    }

    public void mostrarLineaVacia() {
        System.out.println();
    }
}
