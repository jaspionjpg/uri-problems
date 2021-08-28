package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2523_AMensagemDeWill {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {
            String letras = ler.next();
            Integer numero = ler.nextInt();
            String finali = "";
            for (int i = 0; i < numero; i++) {
                int valor = ler.nextInt();
                finali += letras.charAt(valor - 1);
            }

            System.out.println(finali);
        }
    }
}
