package bingo_kotlin
class Carton {
    val numeros: MutableList<Int> = generarCarton()

    private fun generarCarton(): MutableList<Int> {
        val numerosDisponibles = (1..75).shuffled()
        return numerosDisponibles.take(24).toMutableList()
    }

    fun mostrarCarton() {
        println("Tu cartón: $numeros")
    }
}
