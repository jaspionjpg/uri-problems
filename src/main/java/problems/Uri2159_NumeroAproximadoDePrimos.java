package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri2159_NumeroAproximadoDePrimos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int j = ler.nextInt();

        double menor = j / Math.log(j);
        double maior = 1.25506 * (j / Math.log(j));
        DecimalFormat formato = new DecimalFormat("#.0");

        System.out.println(formato.format(menor) + " " + formato.format(maior));
    }
}
