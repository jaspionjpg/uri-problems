package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2234_CachorrosQuentes {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int j = ler.nextInt();

        System.out.printf("%.2f\n", (float) n / j);
    }
}
