package Utils.Builders;

import Models.Arquero;
import Stategies.AtaqueRapido;
import Stategies.DisparoPreciso;

public class ArqueroBuilder extends PersonajeBuilder<Arquero> {
    @Override
    public void crearPersonaje() {
        this.personaje = new Arquero();
        setFuerza(60)
                .setInteligencia(50)
                .setVelocidad(80)
                .setResistencia(40)
                .setPrecision(90)
                .agregarHabilidad(new DisparoPreciso())
                .agregarHabilidad(new AtaqueRapido());
    }

}
