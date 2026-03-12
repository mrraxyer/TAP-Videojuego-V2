package Models;

public class Arquero extends Personaje {
    public Arquero() {
        super("Arquero");
    }

    @Override
    protected String mostrarEstadisticasEspeciales() {
        return "\nPrecisión: " + precision;
    }
}
