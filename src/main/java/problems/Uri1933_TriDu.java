package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1933_TriDu {
    public static void main(String[] args) throws IOException {
        Long n, l;
        Scanner ler = new Scanner(System.in);

        n = ler.nextLong();
        l = ler.nextLong();

        if (n == l) {
            System.out.println(n);

        } else if (n > l) {
            System.out.println(n);
        } else if (n < l) {
            System.out.println(l);
        }
    }
}
