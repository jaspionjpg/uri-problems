package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1064_PositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int positivos = 0;
        double media = 0;
        DecimalFormat format = new DecimalFormat("#.#");
        for (int i = 0; i < 6; i++) {
            double j = ler.nextDouble();

            if (j > 0) {
                positivos++;
                media += j;
            }

        }
        System.out.println(positivos + " valores positivos");
        System.out.println(format.format(media / positivos));
    }
}
