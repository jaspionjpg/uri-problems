package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1170_Blobs {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = 1;
            double asdf = ler.nextDouble();

            while (asdf / 2 > 1) {
                asdf = asdf / 2;
                j++;
            }

            System.out.println(j + " dias");
        }
    }
}
