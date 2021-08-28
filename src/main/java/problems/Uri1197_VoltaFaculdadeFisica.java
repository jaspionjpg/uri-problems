package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1197_VoltaFaculdadeFisica {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            int n = ler.nextInt();
            int j = ler.nextInt();

            System.out.println(n * j * 2);
        }
    }
}
