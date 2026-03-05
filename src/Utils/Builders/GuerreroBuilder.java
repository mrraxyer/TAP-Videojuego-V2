package Utils.Builders;

import Models.Guerrero;

public class GuerreroBuilder extends PersonajeBuilder<Guerrero> {
    @Override
    public void crearPersonaje() {
        setTipo("Guerrero");
        this.personaje = new Guerrero(this);
    }
}
