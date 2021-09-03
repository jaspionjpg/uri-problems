package problems

import java.util.Scanner

fun main(args: Array<String>) {
    val ler = Scanner(System.`in`)

    while (ler.hasNextLine()) {
        val paraAlterar = ler.nextLine()
        val mudarParaQue = ler.nextLine()
        val frase = ler.nextLine()

        var fraseFinal = ""
        var tag = ""
        for (indice in frase.indices) {
            if (frase[indice] == '<')
                tag += frase[indice]
            else if (frase[indice] == '>') {
                fraseFinal += tag.replace(paraAlterar, mudarParaQue, true) + frase[indice]
                tag = ""
            } else {
                if (tag.isNotEmpty())
                    tag += frase[indice]
                else fraseFinal += frase[indice]
            }
        }
        println(fraseFinal)
    }
}
/*

URI Online Judge | 1254
Substituição de Tag
Por TopCoder*  EUA

Timelimit: 1
Você está no comando de um sistema de documentos que utiliza tags de código numérico para renderizar documentos para impressão. Há um lote de documentos com o texto baseado em tags, que você deve analisar e converter para tags numéricas para a entrada no sistema. Uma tag é iniciada por um caracter '<', que pode ser seguida por letras, números, barras ou espaços, e para finalizar a tag um caracter '>'. As tags não podem ser encaixadas umas nas outras.

As seguintes tags não são válidas:
">HI", "<a<b>c>", "<a b c><", "<a<b>".

As seguintes tags são válidas:
"/=<>HI", "/<>H=I<>/", "<><><><>", "<a=/><b==//bb><c223>", "<a b c>".

Para as comparações entre caracteres deve ser desconsiderado o case sensitive.

Entrada
A entrada contém vários casos de teste. Cada caso de teste é composto de três linhas. A primeira linha contém a tag original presente no texto do documento, que irá conter apenas letras (a-z, A-Z), e seu tamanho será entre 1 e 10 caracteres inclusive. A segunda linha contém um valor numérico pela qual a tag original deverá ser substituida, que será um número entre 1 e 1000 inclusive. A terceira e última linha terá entre 1 e 50 caracteres inclusive, e poderá conter os letras (a-z, A-Z), números (0-9), sinal de menor (<), sinal de maior (>), sinais de igual (=), barras (/), ou espaços em branco. Todos os '<' e '>' são usados apenas em tags.

Saída
Converto o texto do documento que é dado na entrada, utilizando as específicações dadas acima e imprima em uma única linha, o novo texto do documento com as novas tags, para maiores esclarecimentos consulte o exemplo abaixo.

Exemplo de Entrada	Exemplo de Saída
BODY
10
<><BODY garbage>body</BODY>
aBc
923
<dont replacethis>abcabc<abcabcde>
table
1
<ta>bLe<TaBlewidth=100></table></ta>
replace
323
nothing inside
HI
667
92<HI=/><z==//HIb><cHIhi>
a
23
<a B c a>
b
2
<b b abc ab c> Mangojata

<><10 garbage>body</10>
<dont replacethis>abcabc<923923de>
<ta>bLe<1width=100></1></ta>
nothing inside
92<667=/><z==//667b><c667667>
<23 B c 23>
<2 2 a2c a2 c> Mangojata

* Este problema é de autoria do TopCoder (www.topcoder.com/tc) e foi adaptado por Jeferson T. para utilização (autorizada) no URI OJ.
* A reprodução não autorizada deste problema sem o consentimento por escrito de TopCoder, Inc. é estritamente proibida.
 */