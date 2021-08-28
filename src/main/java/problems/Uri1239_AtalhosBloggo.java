package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1239_AtalhosBloggo {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String linha = "";

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            Boolean i = true;
            Boolean b = true;

            for (int j = 0; j < linha.length(); j++) {
                String atual = "";
                if (linha.charAt(j) == '_') {
                    if (i) {
                        atual = "<i>";
                        i = !i;
                    } else {
                        atual = "</i>";
                        i = !i;
                    }
                } else if (linha.charAt(j) == '*') {
                    if (b) {
                        atual = "<b>";
                        b = !b;
                    } else {
                        atual = "</b>";
                        b = !b;
                    }
                } else {
                    atual = linha.charAt(j) + "";
                }
                System.out.print(atual);
            }
            System.out.println();
        }
    }
}
