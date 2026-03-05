package Stategies;

public class Curacion implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El personaje invoca energía divina para sanarse!");
    }
}
