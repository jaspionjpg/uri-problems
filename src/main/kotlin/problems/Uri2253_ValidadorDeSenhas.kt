package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    while (ler.hasNextLine()) {
        val senha = ler.nextLine()

        var numero = false
        var maiusculo = false
        var minusculo = false
        for (caractere in senha) {
            when (caractere) {
                in 'a'..'z' -> minusculo = true
                in 'A'..'Z' -> maiusculo = true
                in '0'..'9' -> numero = true
            }
        }

        val senhaRemovendoEspeciais = senha.replace(Regex("[^a-zA-Z0-9]"), "")

        if (senhaRemovendoEspeciais.length == senha.length &&
            senha.length > 5 && senha.length < 33 &&
            numero && maiusculo && minusculo
        )
            println("Senha valida.")
        else println("Senha invalida.")
    }
}

/*
URI Online Judge | 2253
Validador de Senhas
Por Gustavo Marmentini, URIBR Brazil

Timelimit: 1
Rolien e Naej são os desenvolvedores de um grande portal de programação. Para ajudar no novo sistema de cadastro do site, eles requisitaram a sua ajuda. Seu trabalho é fazer um código que valide as senhas que são cadastradas no portal, para isso você deve atentar aos requisitos a seguir:

A senha deve conter, no mínimo, uma letra maiúscula, uma letra minúscula e um número;
A mesma não pode ter nenhum caractere de pontuação, acentuação ou espaço;
Além disso, a senha pode ter de 6 a 32 caracteres.
Entrada
A entrada contém vários casos de teste e termina com final de arquivo. Cada linha tem uma string S, correspondente a senha que é inserida pelo usuário no momento do cadastro.

Saída
A saída contém uma linha, que pode ser “Senha valida.”, caso a senha tenha cada item dos requisitos solicitados anteriormente, ou “Senha invalida.”, se um ou mais requisitos não forem atendidos.

Exemplo de Entrada	Exemplo de Saída
URI Online Judge
AbcdEfgh99
URIOnlineJudge12
URI Online Judge 12
Aass9
Aassd9

Senha invalida.

Senha valida.

Senha valida.

Senha invalida.

Senha invalida.

Senha valida.
 */