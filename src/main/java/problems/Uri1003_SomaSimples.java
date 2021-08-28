package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1003_SomaSimples {
    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int soma;
        Scanner ler = new Scanner(System.in);

        a = ler.nextInt();
        b = ler.nextInt();

        soma = a + b;

        System.out.println("" + "SOMA = " + soma);
    }
}
