package Utils.Factories;

public class PersonajeFactory {
    public static Utils.Builders.PersonajeBuilder<?> crearBuilder(String tipo) {
        Utils.Builders.PersonajeBuilder<?> builder;
        switch (tipo.toLowerCase()) {
            case "guerrero":
                builder = new Utils.Builders.GuerreroBuilder();
                break;
            case "mago":
                builder = new Utils.Builders.MagoBuilder();
                break;
            case "arquero":
                builder = new Utils.Builders.ArqueroBuilder();
                break;
            case "paladin":
                builder = new Utils.Builders.PaladinBuilder();
                break;
            default:
                throw new IllegalArgumentException("Tipo de personaje desconocido: " + tipo);
        }
        builder.crearPersonaje();
        return builder;
    }
}
