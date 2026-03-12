package Utils.Builders;

import Models.Guerrero;
import Stategies.AtaqueEspadazo;
import Stategies.DefensaEscudo;

public class GuerreroBuilder extends PersonajeBuilder<Guerrero> {
    @Override
    public void crearPersonaje() {
        this.personaje = new Guerrero();
        setFuerza(80)
                .setInteligencia(40)
                .setVelocidad(60)
                .setResistencia(70)
                .agregarHabilidad(new AtaqueEspadazo())
                .agregarHabilidad(new DefensaEscudo());
    }
}
