/*
    Var => valor mútavel, CamelCase - Variavel pode ter valor alterado durante o código
    Val => valor imútavel, CamelCase - Variável terá somente o valor atribuído 
    Const Val => valor imútavel, Snake_Case - Constante onde valor é atribuído durante a compilação

*/

/*
    Exemplos

    Var => var idade = 22       val idade = 22          const val MIN_IDADE = 16
    var idade:Int?              val idade:Int?          const val MIN_IDADE = 68
    idade = null ou 22          idade = null ou 22   

*/

fun main() {
    val idade = 35
    //idade = 90
    
    println(idade)
}

const val MAX_IDADE = 79
// Função Principal
fun main2 () {
    var idade_2:Int
    idade_2 = 70

    println(idade_2 > MAX_IDADE)
}
