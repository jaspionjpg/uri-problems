package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1467_ZerinhoOuUm {
    public static void main(String[] args) throws IOException {
        int a, b, c;
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {
            a = ler.nextInt();
            b = ler.nextInt();
            c = ler.nextInt();
            if (a == b && b == c) {
                System.out.println("*");
            }
            if (a != b && a != c && b == c) {
                System.out.println("A");
            }
            if (b != a && b != c && a == c) {
                System.out.println("B");
            }
            if (c != b && c != a && a == b) {
                System.out.println("C");
            }
        }
    }
}
