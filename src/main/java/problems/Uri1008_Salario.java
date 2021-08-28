package problems;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Uri1008_Salario {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int numf = ler.nextInt();
        int horas = ler.nextInt();
        double preco = ler.nextDouble();
        double salario;


        BigDecimal preco1 = new BigDecimal(preco).setScale(2, RoundingMode.HALF_DOWN);

        preco = preco1.doubleValue();

        salario = horas * preco;

        BigDecimal media1 = new BigDecimal(salario).setScale(2, RoundingMode.HALF_DOWN);

        System.out.println("NUMBER = " + numf);
        System.out.println("SALARY = U$ " + media1);
    }
}
