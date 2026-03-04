package Stategies;

public class AtaqueEspadazo implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El guerrero ejecuta un Espadazo!");
    }
}
