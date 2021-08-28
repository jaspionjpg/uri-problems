package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1235_DeDentroParaFora {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = Integer.parseInt(ler.nextLine());
        for (int i = 0; i < n; i++) {
            String frase = ler.nextLine();
            String frase1 = frase.substring(frase.length() / 2);
            String frase2 = frase.substring(0, frase.length() / 2);
            System.out.print(new StringBuilder(frase2).reverse());
            System.out.print(new StringBuilder(frase1).reverse());
            System.out.println();
        }
    }
}
