package Utils.Builders;

import Stategies.HabilidadStrategy;
import Models.Personaje;

public abstract class PersonajeBuilder<T extends Personaje> {
    protected T personaje;
    public String tipo;

    public abstract void crearPersonaje();

    public PersonajeBuilder<T> agregarHabilidad(HabilidadStrategy habilidad) {
        personaje.agregarHabilidad(habilidad);
        return this;
    }

    public T obtenerPersonaje() {
        return personaje;
    }

    public PersonajeBuilder<T> setTipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    public PersonajeBuilder<T> setFuerza(int fuerza) {
        personaje.setFuerza(fuerza);
        return this;
    }

    public PersonajeBuilder<T> setInteligencia(int inteligencia) {
        personaje.setInteligencia(inteligencia);
        return this;
    }

    public PersonajeBuilder<T> setVelocidad(int velocidad) {
        personaje.setVelocidad(velocidad);
        return this;
    }

    public PersonajeBuilder<T> setResistencia(int resistencia) {
        personaje.setResistencia(resistencia);
        return this;
    }
}
