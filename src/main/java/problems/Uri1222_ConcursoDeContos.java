package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1222_ConcursoDeContos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNextInt()) {
            int palavras = ler.nextInt();
            int linhas = ler.nextInt();
            int tamanhaPorLinha = ler.nextInt();

            int pagina = 1;
            int linhaAtual = 1;
            int caractereDaLinha = 0;

            for (int i = 0; i < palavras; i++) {
                String palavra = ler.next();
                if ((caractereDaLinha + palavra.length()) > tamanhaPorLinha) {
                    if (linhas == linhaAtual) {
                        linhaAtual = 1;
                        pagina++;

                        caractereDaLinha = palavra.length() + 1;
                    } else {
                        linhaAtual++;
                        caractereDaLinha = palavra.length() + 1;
                    }
                } else {
                    caractereDaLinha += palavra.length() + 1;
                }
            }

            System.out.println(pagina);
        }
    }
}
