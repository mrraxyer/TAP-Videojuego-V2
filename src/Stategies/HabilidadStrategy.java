package Stategies;

public interface HabilidadStrategy {
    String usar();

    default String getNombre() {
        return this.getClass().getSimpleName();
    }
}
