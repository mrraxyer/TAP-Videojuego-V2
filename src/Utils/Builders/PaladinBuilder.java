package Utils.Builders;

import Models.Paladin;
import Stategies.Curacion;
import Stategies.EscudoSagrado;

public class PaladinBuilder extends PersonajeBuilder<Paladin> {
    @Override
    public void crearPersonaje() {
        this.personaje = new Paladin();
        setFuerza(8)
                .setInteligencia(5)
                .setVelocidad(5)
                .setResistencia(9)
                .setFe(7)
                .agregarHabilidad(new EscudoSagrado())
                .agregarHabilidad(new Curacion());
    }

}
