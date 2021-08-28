package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2543_JogatinaUFPR {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {
            int y = ler.nextInt();
            int numero = ler.nextInt();
            int x = 0;
            for (int i = 0; i < y; i++) {
                int numero2 = ler.nextInt();
                int lige = ler.nextInt();

                if (numero2 == numero && lige == 0) {
                    x++;
                }

            }
            System.out.println(x);
        }
    }
}
