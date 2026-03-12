package Utils.Factories;

import Utils.Builders.*;

// Clase factory para crear builder de personajes segun su tipo
public class PersonajeFactory {
    // Metodo estatico para crear el builder del personaje segun su tipo
    public static PersonajeBuilder<?> crearBuilder(String tipo) {
        PersonajeBuilder<?> builder;
        switch (tipo.toLowerCase()) {
            case "guerrero":
                builder = new GuerreroBuilder();
                break;
            case "mago":
                builder = new MagoBuilder();
                break;
            case "arquero":
                builder = new ArqueroBuilder();
                break;
            case "paladin":
                builder = new PaladinBuilder();
                break;
            default:
                throw new IllegalArgumentException("Tipo de personaje desconocido: " + tipo);
        }

        // Se llama al metodo crearPersonaje del builder para inicializar el personaje antes de retornarlo
        builder.crearPersonaje();
        return builder;
    }
}
