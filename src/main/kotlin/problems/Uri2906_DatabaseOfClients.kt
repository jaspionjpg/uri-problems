package problems

import java.util.*

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)
    val numeroDeEmails = Array(ler.nextInt()) { indice ->
        val palavra = ler.next()
        var palavraInicialAntesArroba = palavra.substringBefore("@")
            .replace(".", "")
            .substringBefore("+")

        palavraInicialAntesArroba + palavra.substringAfter("@")
    }.toSet().size

    println(numeroDeEmails)
}

/*
beecrowd | 2906
Database of Clients
Por Paulo Cezar Pereira Costa BR Brazil

Timelimit: 1
Nowadays there are billions of email users. A little-known fact is that some email providers offer way more than the usual username@provider.com email address.

Some providers simply ignore dots in usernames. Thus, if John owns the username johnsmith, he could tell people that his email address is johnsmith@provider.com, john.smith@provider.com or john.s.mith@provider.com, among others. Emails sent to any of these addresses would end up on his mailbox.

Other providers allow appending the character “+” followed by any combination of letters and/or digits after the username. With this feature, by registering the username johnsmith, John would also be able to use johnsmith+friends@provider.com and johnsmith+2x3is6@provider.com.

Sometimes both features are available at once and in those cases john.smith+icpc@provider.com and john.smith+wants.2.eat.lemon.3.14@provider.com are valid addresses that John could use.

This is quite useful for users, who can manage different addresses to help organize their mailboxes and easily filter the newsletters eventually sent after registering on a new website. Unfortunately, this also opens up space for abuse. Some websites rely upon the fact that each email address identifies a single user. However, a misbehaving user might easily create multiple accounts by taking advantage of the multiple addresses allowed by the email provider.

After learning all of this your boss got really worried. What if the number of unique users that has been reported to the shareholders is not accurate, bloated by duplicate accounts instead? That brings you to the task at hand: given the list of all email addresses from the users database of the company, you must determine the real number of unique users, assuming that all email providers have both described features available.

Entrada
The first line contains an integer N (1 ≤ N ≤ 1000) representing the number of email addresses in the database. Each of the next N lines contains a string of at most 100 characters representing an email address in the database. Each email address has the form localpart@provider where localpart is a non-empty list of labels with a “.” (dot) or a “+” (plus sign) between each pair of consecutive labels, and provider is a non-empty list of labels always with a “.” (dot) between each pair of consecutive labels. A label is a non-empty sequence of lowercase letters and/or digits. The character “+” (plus sign) appears at most once in each email address.

Saída
Output a single line with an integer indicating the number of unique users in the database.

Exemplos de Entrada	Exemplos de Saída
2

two.different.providers@now.here

two.different.providers@nowhere

2

2

1.2.3@testing

testing@1.2.3

2

7

alice@e.mail

eve@another.mail

bob@e.mail

joe90@e.mail

b.o.b@e.mail

bob+new@e.mail

bob@another.provider

5

Final Nacional da XXIII Maratona SBC de Programação
 */