package Utils.Builders;

import Stategies.HabilidadStrategy;
import Models.Personaje;

public abstract class PersonajeBuilder<T extends Personaje> {
    protected T personaje;

    public abstract void crearPersonaje();

    public PersonajeBuilder<T> agregarHabilidad(HabilidadStrategy habilidad) {
        personaje.agregarHabilidad(habilidad);
        return this;
    }

    public T obtenerPersonaje() {
        return personaje;
    }
}
