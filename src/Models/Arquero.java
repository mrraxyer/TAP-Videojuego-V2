package Models;

// Clase concreta del pesonaje Arquero que extiende de Personaje
public class Arquero extends Personaje {
    public Arquero() {
        super("Arquero");
    }

    // Metodo para mostrar las estadisticas especiales del arquero
    @Override
    protected String mostrarEstadisticasEspeciales() {
        return "\nPrecisión: " + precision;
    }
}
