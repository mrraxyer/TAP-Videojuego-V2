package Utils.Builders;

import Models.Guerrero;

public class GuerreroBuilder extends PersonajeBuilder<Guerrero> {

    @Override
    public void crearPersonaje() {
        personaje = new Guerrero();
    }
}
