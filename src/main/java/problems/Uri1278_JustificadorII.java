package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1278_JustificadorII {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String numero = "";
        int k = 0;

        while (Integer.parseInt(numero = ler.nextLine()) != 0) {
            if (k != 0) {
                System.out.println();
            }
            k++;
            String[] listaFrases = new String[Integer.parseInt(numero)];
            int maiorLength = 0;
            for (int i = 0; i < listaFrases.length; i++) {
                listaFrases[i] = ler.nextLine().replaceAll("\\s+", " ").trim();
                if (listaFrases[i].length() > maiorLength) {
                    maiorLength = listaFrases[i].length();
                }
            }
            for (int i = 0; i < listaFrases.length; i++) {
                while (listaFrases[i].length() < maiorLength) {
                    listaFrases[i] = " " + listaFrases[i];
                }
                System.out.println(listaFrases[i]);
            }
        }
    }
}
