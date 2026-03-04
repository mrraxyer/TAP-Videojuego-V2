package Stategies;

public class CuracionMagica implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El mago realiza una curación mágica!");
    }
}
