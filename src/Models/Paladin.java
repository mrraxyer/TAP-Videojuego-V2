package Models;

public class Paladin extends Personaje {
    public Paladin() {
        super("Paladin");
    }

    @Override
    protected String mostrarEstadisticasEspeciales() {
        return "\nFe: " + fe;
    }
}
