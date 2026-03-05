package Utils.Builders;

import Models.Guerrero;

public class MagoBuilder extends PersonajeBuilder<Guerrero> {
    @Override
    public void crearPersonaje() {
        setTipo("Guerrero");
        this.personaje = new Guerrero(this);
    }
}
