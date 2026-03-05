package Stategies;

public class DisparoPreciso implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El arquero dispara una flecha con precisión mortal!");
    }
}
