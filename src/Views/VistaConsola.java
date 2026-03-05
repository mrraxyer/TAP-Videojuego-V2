package Views;

public class VistaConsola {
    private static final String SEPARADOR = "-------";

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public void mostrarTitulo(String titulo) {
        System.out.println("\n" + titulo);
        System.out.println(SEPARADOR);
    }
}
