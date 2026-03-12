package Models;

import Stategies.HabilidadStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Personaje {
    protected String tipo;
    protected int fuerza;
    protected int inteligencia;
    protected int velocidad;
    protected int resistencia;
    protected int precision;
    protected int fe;
    protected List<HabilidadStrategy> habilidades;

    public Personaje(String tipo) {
        this.tipo = tipo;
        this.habilidades = new ArrayList<>();
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public void setFe(int fe) {
        this.fe = fe;
    }

    public void agregarHabilidad(HabilidadStrategy habilidad) {
        this.habilidades.add(habilidad);
    }

    public String getTipo() {
        return tipo;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public int getPrecision() {
        return precision;
    }

    public int getFe() {
        return fe;
    }

    public List<HabilidadStrategy> getHabilidades() {
        return habilidades;
    }

    public String mostrarFicha() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFicha del Personaje");
        sb.append("\n-------");
        sb.append("\nTipo: ").append(tipo);
        sb.append("\nFuerza: ").append(fuerza);
        sb.append("\nInteligencia: ").append(inteligencia);
        sb.append("\nVelocidad: ").append(velocidad);
        sb.append("\nResistencia: ").append(resistencia);
        sb.append("\nHabilidades: ").append(habilidades.size());
        sb.append("\n-------\n");
        return sb.toString();
    }

    public String ejecutarHabilidades() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nEjecutando habilidades de ").append(tipo);
        sb.append("\n-------");
        if (habilidades.isEmpty()) {
            sb.append("\nEste personaje no tiene habilidades asignadas.");
        } else {
            for (HabilidadStrategy habilidad : habilidades) {
                sb.append("\n- ").append(habilidad.usar());
            }
        }
        sb.append("\n-------\n");
        return sb.toString();
    }
}