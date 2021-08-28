package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1555_Funcoes {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            int x = ler.nextInt();

            double resultado1 = ((3 * j) * (3 * j)) + x * x;
            double resultado2 = 2 * (j * j) + ((5 * x) * (5 * x));
            double resultado3 = -100 * j + (x * x * x);

            if (resultado1 > resultado2 && resultado1 > resultado3) {
                System.out.println("Rafael ganhou");
            } else if (resultado2 > resultado1 && resultado2 > resultado3) {
                System.out.println("Beto ganhou");
            } else {
                System.out.println("Carlos ganhou");
            }
        }
    }
}
