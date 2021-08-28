package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1585_FazendoPandorgas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            int k = ler.nextInt();

            System.out.println(k * j / 2 + " cm2");
        }
    }
}
