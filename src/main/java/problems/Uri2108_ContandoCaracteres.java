package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2108_ContandoCaracteres {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String maiorPalavra = "";
        while (true) {
            String frase = ler.nextLine();
            if (frase.equals("0")) {
                break;
            }

            String[] palavras = frase.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (palavras[i].length() >= maiorPalavra.length()) {
                    maiorPalavra = palavras[i];
                }
                if (i == palavras.length - 1) {
                    System.out.print(palavras[i].length());
                } else {
                    System.out.print(palavras[i].length() + "-");
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("The biggest word: " + maiorPalavra);
    }
}
