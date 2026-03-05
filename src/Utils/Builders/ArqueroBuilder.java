package Utils.Builders;

import Models.Arquero;

public class ArqueroBuilder extends PersonajeBuilder<Arquero> {
    @Override
    public void crearPersonaje() {
        setTipo("Arquero");
        this.personaje = new Arquero(this);
    }

}
