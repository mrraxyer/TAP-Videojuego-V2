package Utils.Builders;

import Models.Arquero;
import Stategies.AtaqueRapido;
import Stategies.DisparoPreciso;

public class ArqueroBuilder extends PersonajeBuilder<Arquero> {
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
