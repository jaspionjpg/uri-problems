package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2484_Abracadabra {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            String palavra = ler.next();
            int tamanho = palavra.length();
            int j = 0;

            for (int l = 0; l < palavra.length(); l++) {

                String finalf = "";

                for (int i = 0; i < tamanho; i++) {
                    finalf += " " + palavra.charAt(i);
                }
                finalf = finalf.trim();
                for (int i = 0; i < j; i++) {
                    finalf = " " + finalf;
                }

                System.out.println(finalf);
                tamanho--;
                j++;
            }
            System.out.println();
        }
    }
}
