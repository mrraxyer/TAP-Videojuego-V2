package Utils.Builders;

import Models.Paladin;
import Stategies.Curacion;
import Stategies.EscudoSagrado;

public class PaladinBuilder extends PersonajeBuilder<Paladin> {
    @Override
    public void crearPersonaje() {
        this.personaje = new Paladin();
        setFuerza(70)
                .setInteligencia(65)
                .setVelocidad(55)
                .setResistencia(85)
                .setFe(95)
                .agregarHabilidad(new EscudoSagrado())
                .agregarHabilidad(new Curacion());
    }

}
