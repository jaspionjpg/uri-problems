package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri2147_Galopeira {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {

            String galopeira = ler.next();
            if (galopeira.length() > 99) {
                DecimalFormat formato = new DecimalFormat("00");
                int as = galopeira.length() / 100;
                int asd = galopeira.length() % 100;
                System.out.println(as + "." + formato.format(asd));
            } else if (galopeira.length() > 9) {
                System.out.println("0." + galopeira.length());
            } else {
                System.out.println("0.0" + galopeira.length());
            }
        }
    }
}
