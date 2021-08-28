package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2221_BatalhaDePomekons {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int[] pok1 = new int[3];
            int[] pok2 = new int[3];
            int bonus = ler.nextInt();

            pok1[0] = ler.nextInt();
            pok1[1] = ler.nextInt();
            pok1[2] = ler.nextInt();

            pok2[0] = ler.nextInt();
            pok2[1] = ler.nextInt();
            pok2[2] = ler.nextInt();

            double totalpok1 = (double) (pok1[0] + pok1[1]) / 2 + (pok1[2] % 2 == 0 ? bonus : 0);
            double totalpok2 = (double) (pok2[0] + pok2[1]) / 2 + (pok2[2] % 2 == 0 ? bonus : 0);

            if (totalpok1 == totalpok2) {
                System.out.println("Empate");
            } else if (totalpok2 > totalpok1) {
                System.out.println("Guarte");
            } else {
                System.out.println("Dabriel");
            }
        }
    }
}
