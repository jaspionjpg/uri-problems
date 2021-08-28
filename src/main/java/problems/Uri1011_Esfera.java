package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1011_Esfera {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        double valorUni1 = ler.nextDouble();
        double volume;

        volume = (4 / 3.0) * 3.14159 * valorUni1 * valorUni1 * valorUni1;

        BigDecimal total1 = new BigDecimal(volume).setScale(3, RoundingMode.HALF_DOWN);

        System.out.println("VOLUME = " + total1);
    }
}
