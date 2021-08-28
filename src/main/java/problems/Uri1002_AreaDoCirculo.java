package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1002_AreaDoCirculo {

    public static void main(String[] args) throws IOException {
        double a;
        double area;

        Scanner ler = new Scanner(System.in);

        a = ler.nextDouble();

        area = a * a * 3.14159;

        BigDecimal valorExato = new BigDecimal(area)
                .setScale(4, RoundingMode.HALF_DOWN);
        System.out.println("A=" + valorExato);
    }
}
