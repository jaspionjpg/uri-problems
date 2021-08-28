package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2232_TrianguloDePascal {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            int total = 0;

            for (int k = 0; k < j; k++) {
                total = total + (int) Math.pow(2, k);
            }

            System.out.println(total);
        }
    }
}
