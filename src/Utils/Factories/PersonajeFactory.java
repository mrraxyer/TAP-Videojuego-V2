package Utils.Factories;

import Utils.Builders.PersonajeBuilder;
import Utils.Builders.GuerreroBuilder;
import Utils.Builders.MagoBuilder;

public class PersonajeFactory {

    public static PersonajeBuilder<?> crearBuilder(String tipoPersonaje) {
        PersonajeBuilder<?> builder = null;

        switch (tipoPersonaje.toLowerCase()) {
            case "guerrero":
                builder = new GuerreroBuilder();
                break;
            case "mago":
                builder = new MagoBuilder();
                break;
            default:
                throw new IllegalArgumentException("Tipo de personaje no válido: " + tipoPersonaje);
        }

        builder.crearPersonaje();
        return builder;
    }
}
