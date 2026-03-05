package Stategies;

public class EscudoSagrado implements HabilidadStrategy {
    @Override
    public void usar() {
        System.out.println("¡El paladín levanta un escudo protector!");
    }
}
