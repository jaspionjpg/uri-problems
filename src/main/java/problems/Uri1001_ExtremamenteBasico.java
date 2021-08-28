package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1001_ExtremamenteBasico {

    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int c;
        Scanner ler = new Scanner(System.in);

        a = ler.nextInt();
        b = ler.nextInt();

        c = a + b;

        System.out.println("X = " + c);
    }
}