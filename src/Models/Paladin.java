package Models;

// Clase concreta del pesonaje Paladin que extiende de Personaje
public class Paladin extends Personaje {
    public Paladin() {
        super("Paladin");
    }

    // Metodo para mostrar las estadisticas especiales del paladin
    @Override
    protected String mostrarEstadisticasEspeciales() {
        return "\nFe: " + fe;
    }
}
