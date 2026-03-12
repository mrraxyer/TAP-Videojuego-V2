package Stategies;

public class Curacion implements HabilidadStrategy {
    @Override
    public String usar() {
        return "¡El personaje invoca energía divina para sanarse!";
    }
}
