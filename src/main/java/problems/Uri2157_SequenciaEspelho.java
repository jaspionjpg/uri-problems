package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2157_SequenciaEspelho {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int in = ler.nextInt();
            int fi = ler.nextInt();

            for (int j = 0; j <= (fi - in); j++) {
                System.out.print(in + j);
            }
            for (int j = 0; j <= (fi - in); j++) {
                System.out.print(new StringBuilder(fi - j + "").reverse());
            }
            System.out.println();
        }
    }
}
