package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2060_DesafioDeBino {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        int n5 = 0;

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            if (j % 2 == 0) {
                n2++;
            }
            if (j % 3 == 0) {
                n3++;
            }
            if (j % 4 == 0) {
                n4++;
            }
            if (j % 5 == 0) {
                n5++;
            }
        }
        System.out.println(n2 + " Multiplo(s) de 2");
        System.out.println(n3 + " Multiplo(s) de 3");
        System.out.println(n4 + " Multiplo(s) de 4");
        System.out.println(n5 + " Multiplo(s) de 5");

    }
}
