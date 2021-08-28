package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1070_SeisNumerosImpares {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i = 0;
        int n = ler.nextInt();

        while (i < 6) {
            if (n % 2 != 0) {
                i++;
                System.out.println(n);
            }
            n++;
        }
    }
}
