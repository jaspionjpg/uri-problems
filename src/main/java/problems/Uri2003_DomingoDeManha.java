package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2003_DomingoDeManha {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n, x;
        int total = 0;
        double f = 0;
        double m = 0;
        n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            x = ler.nextInt();
            f = ler.nextDouble();
            if (m < f) {
                m = f;
                total = x;
            }
        }

        if (m >= 8.0) {
            System.out.println(total);
        } else {
            System.out.println("Minimum note not reached");
        }
    }
}
