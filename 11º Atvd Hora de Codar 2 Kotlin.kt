fun main() {
    var v1: Int
    var v2: Int
    var op: Int
    var resu: Double

    print("Informe o 1º Valor: ")
    v1 = readln().toInt()

    print("Informe o 2º Valor: ")
    v2 = readln().toInt()

    println("Operação:")
    println("1) Adição")
    println("2) Subtração")
    println("3) Divisão")
    println("4) Multiplicação")

    print("Qual operação escolhida: ")
    op = readln().toInt()

    when (op) {
        1 -> resu = (v1 + v2).toDouble()
        2 -> resu = (v1 - v2).toDouble()
        3 -> resu = (v1 / v2).toDouble()
        4 -> resu = (v1 * v2).toDouble()

        else -> {
            println("Operação inválida!")
            return //Caso o usuário insira uma operação inválida (diferente de 1, 2, 3 ou 4), o programa exibe uma mensagem de erro e encerra a execução com RETURN
        }
    }

    println("Resultado: $resu")
}
