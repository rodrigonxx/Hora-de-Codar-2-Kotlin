fun main() {
    var v1: Int
    var v2: Int
    var v3: Int
    var v4: Int
    var maior: Int

    print("Informe o 1º Numero: ")
    v1 = readln().toInt()

    print("Informe o 2º Numero: ")
    v2 = readln().toInt()

    print("Informe o 3º Numero: ")
    v3 = readln().toInt()

    print("Informe o 4º Numero: ")
    v4 = readln().toInt()

    println("$v1 $v4")

    if (v1 > v2 && v1 > v3 && v1 > v4) maior = v1

    if (v2 > v1 && v2 > v3 && v2 > v4) maior = v2

    else if (v3 > v1 && v3 > v2 && v3 > v4) maior = v3

    else maior = v4

    println("maior numero de todos é: $maior")

}
