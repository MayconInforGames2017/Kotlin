// Comparando resultados
const val EQUAL = 0
const val LESS = -1
const val MORE = 1

// Função Principal
fun main() {
    val d = 220
    val t = 219

        println(d == t)
        println(d.compareTo(t) >= EQUAL)
        println(!d.equals(t))

}