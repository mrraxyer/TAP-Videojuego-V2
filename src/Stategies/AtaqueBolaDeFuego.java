package Stategies;

public class AtaqueBolaDeFuego implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El mago lanza una Bola de Fuego!");
    }
}
