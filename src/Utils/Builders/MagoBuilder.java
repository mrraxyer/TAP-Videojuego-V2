package Utils.Builders;

import Models.Mago;

public class MagoBuilder extends PersonajeBuilder<Mago> {

    @Override
    public void crearPersonaje() {
        personaje = new Mago();
    }
}
