package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2116_DiversaoDosAlunos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        int j = ler.nextInt();

        for (int i = n; i > 1; i--) {
            if (ePrimo(i)) {
                n = i;
                break;
            }
        }

        for (int i = j; i > 1; i--) {
            if (ePrimo(i)) {
                j = i;
                break;
            }
        }

        System.out.println(j * n);
    }

    public static boolean ePrimo(int num) {
        boolean ePrimos = true;

        for (int i = num - 1; i > 1; i--) {
            if (num % i == 0) {
                ePrimos = false;
                break;
            }
        }
        return ePrimos;
    }
}
