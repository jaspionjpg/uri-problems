package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2140_DuasNotas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (true) {
            int i = ler.nextInt();
            int n = ler.nextInt();

            if (i == 0 && n == 0) {
                break;
            }
            int coisas = 0;
            int total = n - i;

            if (total > 99) {
                total -= 100;
                coisas++;
            }
            if (total > 49) {
                total -= 50;
                coisas++;
            }
            if (total > 19) {
                total -= 20;
                coisas++;
            }
            if (total > 9) {
                total -= 10;
                coisas++;
            }
            if (total > 4) {
                total -= 5;
                coisas++;
            }
            if (total > 1) {
                total -= 2;
                coisas++;
            }
            if (coisas != 2) {
                System.out.println("impossible");
            } else {
                System.out.println("possible");
            }
        }
    }
}
