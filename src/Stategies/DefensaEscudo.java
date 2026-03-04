package Stategies;

public class DefensaEscudo implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El guerrero se defiende con su escudo!");
    }
}
