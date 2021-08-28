package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1329_CaraOuCoroa {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n;
        while ((n = ler.nextInt()) != 0) {
            int cara = 0;
            int coroa = 0;

            for (int i = 0; i < n; i++) {
                int j = ler.nextInt();
                if (j == 1) {
                    cara++;
                } else {
                    coroa++;
                }
            }
            System.out.println("Mary won " + coroa + " times and John won " + cara + " times");
        }
    }
}
