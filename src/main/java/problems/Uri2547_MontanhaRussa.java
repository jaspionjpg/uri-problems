package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2547_MontanhaRussa {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {

            Integer y = ler.nextInt();
            Integer min = ler.nextInt();
            Integer max = ler.nextInt();
            int x = 0;
            for (int i = 0; i < y; i++) {
                if (!ler.hasNext()) {
                    break;
                }
                Integer alt = ler.nextInt();

                if (alt >= min && alt <= max) {
                    x++;
                }
            }

            System.out.println(x);
        }
    }
}
