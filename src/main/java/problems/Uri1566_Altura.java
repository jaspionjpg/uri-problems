package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1566_Altura {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Integer cidades = ler.nextInt();

        for (int i = 0; i < cidades; i++) {
            Integer pessoasCidades = ler.nextInt();

            int[] alturas = new int[230];
            for (int j = 0; j < pessoasCidades; j++) {
                alturas[ler.nextInt()] += 1;
            }

            Boolean primeiro = false;
            for (int j = 0; j < alturas.length; j++) {
                for (int k = 0; k < alturas[j]; k++) {
                    if (primeiro) {
                        System.out.print(" " + j);
                    } else {
                        primeiro = true;
                        System.out.print(j);
                    }
                }
            }
            System.out.println();
        }
    }
}
