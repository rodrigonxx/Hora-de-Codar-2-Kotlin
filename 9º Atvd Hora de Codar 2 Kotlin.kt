fun main() {
    var ano_nasc: Int
    var ano_atual: Int
    var idade: Int

    print("Informe o ano de seu nascimento:")
    var ano_nas = readln().toInt()

    ano_atual = 2025

    idade = ano_atual - ano_nas

    if (idade >= 16) println("Eba! Você pode votar!")
    else println("Ops! você não pode votar ainda")



}