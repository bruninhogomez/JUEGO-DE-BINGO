package bingo_kotlin

class Sorteo {
    private val numerosSorteados = mutableListOf<Int>()

    fun sacarNumero(): Int {
        val numero = (1..75).filter { it !in numerosSorteados }.random()
        numerosSorteados.add(numero)
        return numero
    }

    fun mostrarNumerosSorteados() {
        println("Números sorteados: $numerosSorteados")
    }

    // ✅ Nueva función para acceder a los números sorteados
    fun getNumerosSorteados(): List<Int> {
        return numerosSorteados
    }
}
