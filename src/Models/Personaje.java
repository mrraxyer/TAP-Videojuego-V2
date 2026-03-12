package Models;

import Stategies.HabilidadStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Personaje {
    private static final Map<String, String> HABILIDADES_EXCLUSIVAS = new HashMap<>();
    static {
        HABILIDADES_EXCLUSIVAS.put("DisparoPreciso", "Arquero");
        HABILIDADES_EXCLUSIVAS.put("EscudoSagrado", "Paladin");
        HABILIDADES_EXCLUSIVAS.put("AtaqueBolaDeFuego", "Mago");
        HABILIDADES_EXCLUSIVAS.put("AtaqueEspadazo", "Guerrero");
    }

    protected String tipo;
    protected int fuerza;
    protected int inteligencia;
    protected int velocidad;
    protected int resistencia;
    protected int precision;
    protected int fe;
    protected int nivel;
    protected List<HabilidadStrategy> habilidades;

    public Personaje(String tipo) {
        this.tipo = tipo;
        this.nivel = 1;
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

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void agregarHabilidad(HabilidadStrategy habilidad) {
        String nombre = habilidad.getNombre();
        if (HABILIDADES_EXCLUSIVAS.containsKey(nombre)) {
            String tipoRequerido = HABILIDADES_EXCLUSIVAS.get(nombre);
            if (!this.tipo.equals(tipoRequerido)) {
                throw new IllegalArgumentException(
                        nombre + " solo puede asignarse a " + tipoRequerido + "s.");
            }
        }
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

    public int getNivel() {
        return nivel;
    }

    public List<HabilidadStrategy> getHabilidades() {
        return habilidades;
    }

    protected String mostrarEstadisticasEspeciales() {
        return "";
    }

    public String mostrarFicha() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nFicha del Personaje");
        sb.append("\n-------");
        sb.append("\nTipo: ").append(tipo);
        sb.append("\nNivel: ").append(nivel);
        sb.append("\nFuerza: ").append(fuerza);
        sb.append("\nInteligencia: ").append(inteligencia);
        sb.append("\nVelocidad: ").append(velocidad);
        sb.append("\nResistencia: ").append(resistencia);
        sb.append(mostrarEstadisticasEspeciales());
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

    public String ejecutarHabilidad(String nombre) {
        for (HabilidadStrategy habilidad : habilidades) {
            if (habilidad.getNombre().equalsIgnoreCase(nombre)) {
                return habilidad.usar();
            }
        }
        return "Habilidad '" + nombre + "' no encontrada en " + tipo + ".";
    }
}