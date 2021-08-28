package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1014_Consumo {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int km = ler.nextInt();
        double gasosa = ler.nextDouble();
        double consumo;

        BigDecimal km1 = new BigDecimal(gasosa).setScale(1, RoundingMode.HALF_DOWN);
        gasosa = km1.doubleValue();
        consumo = km / gasosa;

        System.out.println(new BigDecimal(consumo).setScale(3, RoundingMode.HALF_DOWN) + " km/l");
    }
}
