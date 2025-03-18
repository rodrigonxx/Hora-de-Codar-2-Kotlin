fun main() {
    var v1: Int
    var v2: Int
    var v3: Int
    var v4: Int
    var v5: Int
    var v6: Int
    var soma = 0

    print("Informe o 1º Numero: ")
    v1 = readln().toInt()

    print("Informe o 2º Numero: ")
    v2 = readln().toInt()

    print("Informe o 3º Numero: ")
    v3 = readln().toInt()

    print("Informe o 4º Numero: ")
    v4 = readln().toInt()

    print("Informe o 5º Numero: ")
    v5 = readln().toInt()

    print("Informe o 6º Numero: ")
    v6 = readln().toInt()

    if (v1 < 72) soma += v1
    if (v2 < 72) soma += v2
    if (v3 < 72) soma += v3
    if (v4 < 72) soma += v4
    if (v5 < 72) soma += v5
    if (v6 < 72) soma += v6


    println("Valores Informados: $v1 | $v2 | $v3 | $v4 | $v5 | $v6")
    println("A soma dos valores inferiores a 72  é: $soma")

}