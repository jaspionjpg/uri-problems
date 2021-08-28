package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1007_Diferenca {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int a = ler.nextInt();
        int b = ler.nextInt();
        int c = ler.nextInt();
        int d = ler.nextInt();
        int diferenca;
        diferenca = a * b - c * d;

        System.out.println("DIFERENCA = " + diferenca);
    }
}
