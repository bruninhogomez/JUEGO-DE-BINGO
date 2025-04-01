package bingo_kotlin

class Juego {
    private val carton = Carton()
    private val sorteo = Sorteo()

    fun jugar() {
        carton.mostrarCarton()

        while (true) {
            val numero = sorteo.sacarNumero()
            println("Número sorteado: $numero")
            sorteo.mostrarNumerosSorteados()

            if (numero in carton.numeros) {
                println("¡Tienes el número $numero en tu cartón!")
            }

            // Simulación: El juego para si se han sacado 10 números
            if (sorteo.getNumerosSorteados().size == 10) {  // ✅ Ahora funciona

                println("Fin del juego.")
                break
            }
        }
    }
}
