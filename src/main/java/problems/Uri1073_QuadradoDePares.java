package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1073_QuadradoDePares {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 2; i <= n; i += 2) {
            System.out.println(i + "^2 = " + (i * i));
        }
    }
}
