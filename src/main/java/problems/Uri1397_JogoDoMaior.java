package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1397_JogoDoMaior {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n;

        while ((n = ler.nextInt()) != 0) {
            int totalesq = 0;
            int totaldir = 0;
            for (int i = 0; i < n; i++) {
                int j = ler.nextInt();
                int k = ler.nextInt();

                if (j > k) {
                    totalesq++;
                } else if (j < k) {
                    totaldir++;
                }
            }
            System.out.println(totalesq + " " + totaldir);
        }
    }
}
