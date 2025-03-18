fun main() {
    var v1: Int
    var v2: Int
    var v3: Int
    var v4: Int
    var v5: Int
    var v6: Int
    var soma: Int

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

    println ("Os números Informados foram:  $v1 | $v2 | $v3 | $v4 | $v5 | $v6")

    soma = v1 + v2 + v3 + v4 + v5 + v6
    println ("A média aritmética do valores é: $soma")


}