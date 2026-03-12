package Models;

import Stategies.HabilidadStrategy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Clase abstracta que representa al personaje base
public abstract class Personaje {
    // Map: Es una estructura de datos que almacena pares clave-valor
    // Facilitan buscar los valores asociados por medio de las keys
    private static final Map<String, String> HABILIDADES_EXCLUSIVAS = new HashMap<>();
    static {
        HABILIDADES_EXCLUSIVAS.put("DisparoPreciso", "Arquero");
        HABILIDADES_EXCLUSIVAS.put("EscudoSagrado", "Paladin");
        HABILIDADES_EXCLUSIVAS.put("AtaqueBolaDeFuego", "Mago");
        HABILIDADES_EXCLUSIVAS.put("AtaqueEspadazo", "Guerrero");
    }

    // Atributos de los personajes
    protected String tipo;
    protected int fuerza;
    protected int inteligencia;
    protected int velocidad;
    protected int resistencia;
    protected int precision;
    protected int fe;
    protected int nivel;
    protected List<HabilidadStrategy> habilidades;

    // Constructor que inicializa el tipo de personaje y sus atributos
    public Personaje(String tipo) {
        this.tipo = tipo;
        this.nivel = 1;
        this.habilidades = new ArrayList<>();
    }

    // Setters y Getters
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

    // Metodo para agregar hablidades al personaje, validando que sean exclusivas de su tipo
    public void agregarHabilidad(HabilidadStrategy habilidad) {
        String nombre = habilidad.getNombre();
        // Se valida si la habilidad es exclusiva de un tipo de personaje y si el personaje coincidad
        if (HABILIDADES_EXCLUSIVAS.containsKey(nombre)) {
            String tipoRequerido = HABILIDADES_EXCLUSIVAS.get(nombre);
            if (!this.tipo.equals(tipoRequerido)) {
                throw new IllegalArgumentException(
                        nombre + " solo puede asignarse a " + tipoRequerido + "s.");
            }
        }
        this.habilidades.add(habilidad);
    }


    // Getters
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

    // Metodo para mostrar la ficha del personaje con sus atributos y habilidades
    public String mostrarFicha() {
        // Stribuilder es una clase para construir y manipular cadenas de caracteres
        // Se utiliza StringBuilder para construir la ficha del persona de forma eficiente
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

    // Metodo para ejecutar todas las habildades del pesona y mostrar su resultado
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

    // Meotod para ejecutar una habilidad especifica del personaje
    // buscando por su nombre y mostrando su resultado, si no se encuentra se muestra un mensaje de error
    public String ejecutarHabilidad(String nombre) {
        for (HabilidadStrategy habilidad : habilidades) {
            if (habilidad.getNombre().equalsIgnoreCase(nombre)) {
                return habilidad.usar();
            }
        }
        return "Habilidad '" + nombre + "' no encontrada en " + tipo + ".";
    }
}