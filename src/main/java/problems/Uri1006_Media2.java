package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1006_Media2 {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double a = ler.nextDouble();
        double b = ler.nextDouble();
        double c = ler.nextDouble();
        double media;

        BigDecimal a1 = new BigDecimal(a).setScale(1, RoundingMode.HALF_DOWN);
        BigDecimal b1 = new BigDecimal(b).setScale(1, RoundingMode.HALF_DOWN);
        BigDecimal c1 = new BigDecimal(c).setScale(1, RoundingMode.HALF_DOWN);

        a = a1.doubleValue();
        b = b1.doubleValue();
        c = c1.doubleValue();

        media = ((a * 0.2) + (b * 0.3) + (c * 0.5));

        BigDecimal media1 = new BigDecimal(media).setScale(1, RoundingMode.HALF_DOWN);

        System.out.println("MEDIA = " + media1);
    }
}
