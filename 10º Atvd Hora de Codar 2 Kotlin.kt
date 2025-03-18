fun main() {
    var generos: Int
    var masculino: Int
    var peso: Double
    var alt: Double

    print("Informe sua altura em metros: ")
    alt = readln().toDouble()

    println("Generos:")

    println("1) Masculino")
    println("2) Feminino")

    print("Qual seu genero: ")
    generos = readln().toInt()


    when (generos) {

        1 -> {
            peso = (62.1 * alt) - 44.7
            println ("Peso ideal para Homem: $peso")
        }

        2 -> {
            peso = (72.7 * alt) - 58
            println ("Peso ideal para Mulher: $peso")

        }
    }
}
