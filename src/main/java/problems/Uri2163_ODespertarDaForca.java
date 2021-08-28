package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2163_ODespertarDaForca {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int j = ler.nextInt();
        int k = ler.nextInt();

        int[][] numeros = new int[j][k];

        for (int i = 0; i < j; i++) {
            for (int m = 0; m < k; m++) {
                numeros[i][m] = ler.nextInt();
            }
        }
        boolean asdf = true;
        for (int i = 0; i < j; i++) {
            for (int m = 0; m < k; m++) {
                if (i > 0 && i < j - 1 && m > 0 && m < k - 1) {
                    if (numeros[i][m] == 42) {
                        if (numeros[i - 1][m] == 7 && numeros[i][m - 1] == 7 && numeros[i - 1][m - 1] == 7)
                            if (numeros[i - 1][m + 1] == 7 && numeros[i + 1][m] == 7) {
                                if (numeros[i][m + 1] == 7 && numeros[i + 1][m + 1] == 7 && numeros[i + 1][m - 1] == 7) {
                                    System.out.println((i + 1) + " " + (1 + m));
                                    asdf = false;
                                }
                            }
                    }
                }
            }

        }
        if (asdf) {
            System.out.println(0 + " " + 0);
        }
    }
}
