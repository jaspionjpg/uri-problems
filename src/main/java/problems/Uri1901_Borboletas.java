package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1901_Borboletas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        int j[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n; k++) {
                j[i][k] = ler.nextInt();
            }
        }
        List<Integer> lista = new ArrayList<Integer>();
        for (int i = 0; i < n * 2; i++) {
            int k = ler.nextInt();
            int l = ler.nextInt();
            if (!(lista.contains(j[k - 1][l - 1]))) {
                lista.add(j[k - 1][l - 1]);
            }
        }
        System.out.println(lista.size());
    }
}
