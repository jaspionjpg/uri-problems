package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1072_Intervalo2 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int nin = 0;
        int nout = 0;
        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();

            if ((j >= 10) && (j <= 20)) {
                nin++;
            } else {
                nout++;
            }
        }
        System.out.println(nin + " in");
        System.out.println(nout + " out");
    }
}
