fun main() {

    var v1: Int
    var v2: Int
    var v3: Int

    print("Informe o 1º Número: ")
    v1 = readln().toInt()

    print("Informe o 2º Número: ")
    v2 = readln().toInt()

    print("Informe o 3º Número: ")
    v3 = readln().toInt()


    if (v1 > v2 && v1 > v3)  print("O Maior Número é o: $v1")

    else if (v2 > v1 && v2> v3)  print("O Maior Número é o: $v2")

    else print("O Maior Número é o: $v3")

}