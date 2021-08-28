package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1866_Conta {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        for (int b = 1; b <= n; b++) {
            int j = ler.nextInt();

            if (j % 2 == 0) {
                System.out.println("0");
            } else {
                System.out.println("1");
            }
        }
    }
}
