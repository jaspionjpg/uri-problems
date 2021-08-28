package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1010_CalculoSimples {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int cod1 = ler.nextInt();
        int qtPecas1 = ler.nextInt();
        double valorUni1 = ler.nextDouble();
        int cod2 = ler.nextInt();
        int qtPecas2 = ler.nextInt();
        double valorUni2 = ler.nextDouble();
        double total;

        BigDecimal valorUni11 = new BigDecimal(valorUni1).setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal valorUni21 = new BigDecimal(valorUni2).setScale(2, RoundingMode.HALF_DOWN);

        valorUni1 = valorUni11.doubleValue();
        valorUni2 = valorUni21.doubleValue();

        total = valorUni1 * qtPecas1 + valorUni2 * qtPecas2;

        BigDecimal total1 = new BigDecimal(total).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("VALOR A PAGAR: R$ " + total1);
    }
}
