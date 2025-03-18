fun main() {
    var n1: Double
    var n2: Double
    var n3: Double
    var n4: Double
    var media: Double

    print("Informe o 1º Número Entre 0 e 10: ")
    n1 = readln().toDouble()

    print("Informe o 2º Número Entre 0 e 10: ")
    n2 = readln().toDouble()

    print("Informe o 3º Número Entre 0 e 10: ")
    n3 = readln().toDouble()

    print("Informe o 4º Número Entre 0 e 10: ")
    n4 = readln().toDouble()

    if (n1 <= 0 && n1 >= 10) print("Número Inválido, o número deve ser maior que 0 e menor que 10")
    if (n2 <= 0 && n2 >= 10) print("Número Inválido, o número deve ser maior que 0 e menor que 10")
    if (n3 <= 0 && n3 >= 10) print("Número Inválido, o número deve ser maior que 0 e menor que 10")
    if (n4 <= 0 && n4 >= 10) print("Número Inválido, o número deve ser maior que 0 e menor que 10")

    media = ((n1 + n2 + n3 + n4)/4)
    println("A média dos Números são: $media")

    if (media > 5) println("Você passou no teste")
    else println("Tente Novamente")
}
