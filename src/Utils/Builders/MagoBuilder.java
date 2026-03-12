package Utils.Builders;

import Models.Mago;
import Stategies.AtaqueBolaDeFuego;
import Stategies.CuracionMagica;

public class MagoBuilder extends PersonajeBuilder<Mago> {
    @Override
    public void crearPersonaje() {
        this.personaje = new Mago();
        setFuerza(40)
                .setInteligencia(80)
                .setVelocidad(50)
                .setResistencia(30)
                .agregarHabilidad(new AtaqueBolaDeFuego())
                .agregarHabilidad(new CuracionMagica());
    }
}
