fun main() {
    var v1: Int
    var v2: Int
    var v3: Int
    var maior1: Int
    var maior2: Int

    print("Informe o 1º Numero: ")
    v1 = readln().toInt()

    print("Informe o 2º Numero: ")
    v2 = readln().toInt()

    print("Informe o 3º Numero: ")
    v3 = readln().toInt()


    if (v1 > v2 && v1 > v3){ maior1 = v1

    if (v2 > v3) { maior2 = v2 }

    else { maior2 = v3 }

    }else { maior1 = v3 }

    if (v1 > v2) { maior2 = v1 }

    else { maior2 = v2 }


    println("A soma dos maiores são: " + (maior1 + maior2))
}

