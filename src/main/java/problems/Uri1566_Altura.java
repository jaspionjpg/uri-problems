package problems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Uri1566_Altura {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int NC = ler.nextInt();
        for (int i = 0; i < NC; i++) {
            int k = ler.nextInt();
            int[] n = new int[k];

            for (int j = 0; j < k; j++) {
                n[j] = ler.nextInt();
            }

            Arrays.sort(n);
            String asdf = "";
            asdf += ("" + n[0]);
            for (int j = 1; j < k; j++) {
                asdf += (" " + n[j]);
            }

            System.out.println(asdf);
        }
    }
}