package Utils.Builders;

import Models.Personaje;
import Stategies.HabilidadStrategy;

// Clase abstracta que define el builder para crear personajes
// con un tipo generico T que extiende de Personaje, lo que permite crear builders
// para diferentes tipos de personajes
public abstract class PersonajeBuilder<T extends Personaje> {
    protected T personaje;

    // Metodo abstracto que debe ser implementado por las clases concretas de builders
    public abstract void crearPersonaje();

    public PersonajeBuilder<T> agregarHabilidad(HabilidadStrategy habilidad) {
        personaje.agregarHabilidad(habilidad);
        return this;
    }

    // Metodo para obtener el pesonaje creado por el builder
    public T obtenerPersonaje() {
        return personaje;
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

    public PersonajeBuilder<T> setPrecision(int precision) {
        personaje.setPrecision(precision);
        return this;
    }

    public PersonajeBuilder<T> setFe(int fe) {
        personaje.setFe(fe);
        return this;
    }

    public PersonajeBuilder<T> setNivel(int nivel) {
        personaje.setNivel(nivel);
        return this;
    }
}
