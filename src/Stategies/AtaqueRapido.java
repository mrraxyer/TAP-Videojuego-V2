package Stategies;

public class AtaqueRapido implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El personaje realiza un ataque rápido y certero!");
    }
}
