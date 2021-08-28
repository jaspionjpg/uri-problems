package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1216_GetlineOne {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        long total = 0;
        long nu = 0;
        long n;
        String nome;
        while (ler.hasNext()) {
            nome = ler.next();
            if (ler.hasNextLong()) {
                n = ler.nextLong();
            } else {
                nome = ler.next();
                n = ler.nextLong();
            }
            total += n;
            nu++;
        }
        System.out.printf("%.1f", total / nu);
    }
}
