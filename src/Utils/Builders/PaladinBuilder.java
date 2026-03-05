package Utils.Builders;

import Models.Paladin;

public class PaladinBuilder extends PersonajeBuilder<Paladin> {
    @Override
    public void crearPersonaje() {
        setTipo("Paladin");
        this.personaje = new Paladin(this);
    }

}
