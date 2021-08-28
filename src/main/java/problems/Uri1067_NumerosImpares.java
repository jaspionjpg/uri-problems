package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1067_NumerosImpares {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        for (int j = 1; j <= n; j++) {
            if (j % 2 != 0) {
                System.out.println(j);
            }
        }
    }
}
