package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1065_ParesEntreCincoNumeros {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int resultado = 0;

        for (int i = 0; i < 5; i++) {
            int j = ler.nextInt();
            if ((j % 2) == 0) {
                resultado++;
            }
        }
        System.out.println(resultado + " valores pares");
    }
}
