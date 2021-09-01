package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1963_OFilme {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("0.##");
        double n1 = ler.nextDouble();
        double n2 = ler.nextDouble();
        n1 = Double.parseDouble(format.format(n1));
        n2 = Double.parseDouble(format.format(n2));

        String resultado = String.format("%.2f", (n2 / n1 - 1) * 100);

        System.out.println(resultado + "%");
    }
}
