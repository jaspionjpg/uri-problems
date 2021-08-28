package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1120_RevisaoContrato {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        long j;
        String numero;

        while (true) {
            j = ler.nextLong();
            numero = ler.next();

            if (j == 0 || numero.equals("0")) {
                break;
            }
            numero = numero.replace(j + "", "");

            for (int i = 0; i < numero.length(); i++) {
                if (numero.charAt(i) == '0') {
                    numero = numero.substring(i, numero.length() - 1);
                }
            }

            if (numero.trim().equals("")) {
                numero = "0";
            }

            System.out.println((numero));
        }
    }
}
