package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1214_AcimaDaMedia {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            List<Integer> bandas = new ArrayList<Integer>();
            int j = ler.nextInt();
            for (int h = 0; h < j; h++) {

                int numero = ler.nextInt();
                bandas.add(numero);
            }

            double m = getMedia(bandas);
            int k = 0;
            for (int h = 0; h < bandas.size(); h++) {
                if (bandas.get(h) > m) {
                    k++;
                }
            }
            Double asdfsadf = new Double(new Double(k) * new Double(100) / new Double(j));
            System.out.printf("%.3f%%\n", asdfsadf);
        }
    }

    public static double getMedia(List<Integer> bandas) {
        double total = 0d;
        for (Integer a : bandas) {
            total += a;
        }
        total /= bandas.size();
        return total;
    }
}
