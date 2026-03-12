package Utils.Factories;

import Utils.Builders.*;

public class PersonajeFactory {
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
        builder.crearPersonaje();
        return builder;
    }
}
