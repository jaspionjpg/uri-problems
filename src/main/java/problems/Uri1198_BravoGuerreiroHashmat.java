package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1198_BravoGuerreiroHashmat {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNextLong()) {
            long n = ler.nextLong();
            long j = ler.nextLong();

            System.out.println(Math.abs(n - j));
        }
    }
}
