package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1069_DiamantesEAreia {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n, j, esq, dir;
        String linha;

        n = ler.nextInt();
        for (int i = 0; i < n; i++) {

            linha = ler.next();
            j = 0;
            esq = 0;
            dir = 0;
            while (j < linha.length()) {
                if (linha.charAt(j) == '<') esq++;
                if (linha.charAt(j) == '>') {
                    if (esq > 0) {
                        dir++;
                        esq--;
                    }
                }
                j++;

            }
            System.out.println(dir);
        }
    }
}
