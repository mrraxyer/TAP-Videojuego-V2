# TAP: Videojuego V2

## 1. Objetivo del proyecto

Diseñar e implementar un sistema en Java que permita construir personajes de un juego de rol. Cada personaje tendrá:

• **Un tipo:** Por ejemplo, Guerrero, Mago
• **Estadísticas base:** Las estadísticas (fuerza, inteligencia, velocidad, resistencia, etc.) variarán según el tipo de personaje
• **Habilidades:** Los personajes pueden tener una o varias habilidades especiales (por ejemplo: Ataque con espada, Ataque con bola de fuego)

**Requisitos Funcionales:**

1. El programa debe poder crear personajes de tipo Guerrero y Mago
2. Cada tipo de personaje tiene unas estadísticas base predefinidas:
   **• Guerrero:** fuerza=10, inteligencia=2, Velocidad=8, Resistencia=8
   **• Mago:** fuerza=3, inteligencia=10, Velocidad=6, Resistencia=6
3. Se le pueden añadir una o varias habilidades al personaje durante su construcción. Debe haber al menos4 habilidades implementadas:
   • **AtaqueEspadazo:** Al usarla, imprime "¡El guerrero ejecuta un Espadazo!"
   • **AtaqueBolaDeFuego:** Al usarla, imprime "¡El mago lanza una Bola de Fuego!"
4. Una vez construido, el personaje debe ser capaz de "mostrar su ficha" (su tipo, sus estadísticas finales) y de **ejecutar todas las habilidades** que se le asignaron

## 2. Estructura del Proyecto

- src / -> Código fuente
- Main.java -> Código principal
- Models / -> Define la estructura y lógica de los personajes 
- Views / -> Se encarga de la interfaz de usuario
- Controllers / -> Gestiona el flujo entre el usuario y los modelos, coordinando las acciones y ataques
- Strategies / -> Define los comportamientos intercambiables
- Utils / -> Builders y Factories
- Builders / -> Para construir personajes complejos paso a paso
- Factories / -> Para instanciar diferentes tipos de personajes de forma agrupada
- README.md -> Instrucciones del proyecto

## 3. Implementaciones del codigo

**Nuevos Personajes:** Se incluyeron las clases de Arquero y Paladín

**Escalado de niveles:** Cada personaje ahora tiene estadísticas base que suben según su nivel

**Habilidades:** Se separaron las habilidades generales de las específicas de cada clase


## 4. Integrantes del Equipo

- Abonce García Rafael
- Cabrera Chavero Oskar Luis
- Gómez Vera Pamela Sofia
- Mendoza Caballero Diego


