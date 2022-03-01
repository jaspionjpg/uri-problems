package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    var assuntos = ler.next()

    var abertos = 0
    for (assunto in assuntos) {
        if (assunto == '(')
            abertos++
        else if (assunto == ')' && abertos > 0)
            abertos--
    }

    if (abertos > 0)
        println("Ainda temos $abertos assunto(s) pendente(s)!")
    else println("Partiu RU!")
}

/*
beecrowd | 2984
Assuntos Pendentes
Por Roger Eliodoro Condras, UFSC-ARA BR Brazil

Timelimit: 1
Nesse período de greve estudantil na UFSC-Araranguá reuniões e assembleias se tornaram eventos frequentes entre os estudantes. Na semana passada, por exemplo, a Jhennifer convocou uma reunião com os estudantes da Engenharia de Computação para falar sobre os desdobramentos da paralização. Durante a reunião, ela percebeu que nem todo o assunto iniciado era de fato terminado e que alguns fechamentos ocorriam sem nem mesmo a pauta ser iniciada. Para tentar controlar essa situação, sempre que um novo assunto era mencionado ela anotava uma abertura de parênteses no seu caderno, e quando uma pauta era finalizada, ela anotava um fechamento de parênteses.

A reunião acabou sendo mais longa do que o esperado, de modo que a Jhennifer já não conseguia mais verificar se todos os assuntos iniciados foram de fato terminados.

Com base nas anotações do caderno, ajude Jhennifer a ver quantos assuntos pendentes existem para serem colocados em pauta antes do fim da reunião. Algum assunto pode ser fechado sem ser aberto previamente, mas a partir do momento que um assunto é aberto ele precisa obrigatoriamente ser fechado.

Entrada
Uma única linha contendo uma string S (S
≤
 100000) formada apenas pelos caracteres ( e ).

Saída
Imprima uma linha “Ainda temos X assunto(s) pendente(s)!“, onde X representa o número de assuntos pendentes na reunião, ou “Partiu RU!” caso não exista mais nenhum assunto pendente.

Exemplos de Entrada	Exemplos de Saída
)))()()(()

Ainda temos 1 assunto(s) pendente(s)!

(())()

Partiu RU!
 */