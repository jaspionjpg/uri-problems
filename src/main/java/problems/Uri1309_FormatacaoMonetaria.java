package problems;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Uri1309_FormatacaoMonetaria {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        while (ler.hasNextInt()) {
            String coisa = ler.next();
            String mano = ler.next();
            if (mano.length() == 1) {
                mano = "0" + mano;
            }
            coisa += "." + mano;
            double valor = Double.parseDouble(coisa);

            System.out.println(NumberFormat.getCurrencyInstance().format(valor));
        }
    }
}
