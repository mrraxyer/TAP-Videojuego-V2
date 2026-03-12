package Utils.Builders;

import Models.Arquero;
import Stategies.AtaqueRapido;
import Stategies.DisparoPreciso;

// Clase concreta del builder para el personaje Arquero que extiende de PersonajeBUilder
public class ArqueroBuilder extends PersonajeBuilder<Arquero> {
    // Metodo para crear el personaje Arquero con sus estadisticas y habilidades especificas
    @Override
    public void crearPersonaje() {
        this.personaje = new Arquero();
        setFuerza(5)
                .setInteligencia(4)
                .setVelocidad(9)
                .setResistencia(5)
                .setPrecision(8)
                .agregarHabilidad(new DisparoPreciso())
                .agregarHabilidad(new AtaqueRapido());
    }

}
