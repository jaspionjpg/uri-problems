package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1962_HaMuitoMuitoTempoAtlas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int diferenca = ler.nextInt();

            if (diferenca < 2015) {
                System.out.println(2015 - diferenca + " D.C.");
            } else {
                System.out.println(diferenca - 2014 + " A.C.");
            }
        }
    }
}
