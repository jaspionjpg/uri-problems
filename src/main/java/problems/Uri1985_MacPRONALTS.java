package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri1985_MacPRONALTS {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        DecimalFormat df = new DecimalFormat("0.00");
        double total = 0;
        for (int i = 0; i < n; i++) {
            int codigo = ler.nextInt();
            int quantidade = ler.nextInt();

            if (codigo == 1001) {
                total += quantidade * 1.50;
            } else if (codigo == 1002) {
                total += quantidade * 2.50;
            } else if (codigo == 1003) {
                total += quantidade * 3.50;
            } else if (codigo == 1004) {
                total += quantidade * 4.50;
            } else if (codigo == 1005) {
                total += quantidade * 5.50;
            }
        }
        System.out.println(df.format(total));
    }
}
