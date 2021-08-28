package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1161_SomaFatoriais {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNextInt()) {
            long n = ler.nextLong();
            long j = ler.nextLong();
            long total = 1;
            long totaln = 1;
            while (n > 0) {
                totaln *= n;
                n--;
            }
            while (j > 0) {
                total *= j;
                j--;
            }
            System.out.println(total + totaln);
        }
    }
}
