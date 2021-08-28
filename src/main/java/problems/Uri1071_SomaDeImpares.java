package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1071_SomaDeImpares {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int nout = ler.nextInt();
        int resultado = 0;
        int maior;
        int menor;
        if (n < nout) {
            maior = n + 1;
            menor = nout;
        } else {
            maior = nout + 1;
            menor = n;
        }

        for (int i = maior; i < menor; i++) {
            if (i % 2 != 0) {
                resultado += i;
            }

        }
        System.out.println(resultado);
    }
}
