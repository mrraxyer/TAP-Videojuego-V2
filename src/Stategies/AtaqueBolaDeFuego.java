package Stategies;

// Clase concreta que implementa la estrategia de ataque de bola de fuego para el mago
public class AtaqueBolaDeFuego implements HabilidadStrategy {
    // Metodo para obtener el nombre de la habilidad
    @Override
    public String usar() {
        return "¡El mago lanza una Bola de Fuego!";
    }
}
