package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1044_Multiplos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int i = ler.nextInt();
        int j = ler.nextInt();

        if (j % i == 0) {
            System.out.println("Sao Multiplos");

        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
}
