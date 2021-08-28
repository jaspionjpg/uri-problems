package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1009_SalarioComBonus {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String nome = ler.next();
        double salario = ler.nextDouble();
        double vendas = ler.nextDouble();
        double total;

        BigDecimal salario1 = new BigDecimal(salario).setScale(2, RoundingMode.HALF_DOWN);
        BigDecimal vendas1 = new BigDecimal(vendas).setScale(2, RoundingMode.HALF_DOWN);

        salario = salario1.doubleValue();
        vendas = vendas1.doubleValue();

        total = salario + (vendas * 0.15);

        BigDecimal total1 = new BigDecimal(total).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("TOTAL = R$ " + total1);
    }
}
