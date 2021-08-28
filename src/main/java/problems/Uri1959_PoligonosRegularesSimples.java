package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1959_PoligonosRegularesSimples {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        long n = ler.nextInt();
        long l = ler.nextInt();
        long p = n * l;
        System.out.println(p);
    }
}
