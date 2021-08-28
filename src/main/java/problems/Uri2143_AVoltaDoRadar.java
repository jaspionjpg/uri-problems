package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2143_AVoltaDoRadar {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n;

        while ((n = ler.nextInt()) != 0) {

            for (int i = 0; i < n; i++) {
                long j = ler.nextInt();
                if (j % 2 != 0) {
                    System.out.println(j * 2 - 1);
                } else {
                    System.out.println(j * 2 - 2);
                }
            }
        }
    }
}
