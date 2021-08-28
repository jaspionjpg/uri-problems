package problems;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Uri2479_OrdenandoAListaDeCriancasDoPapaiNoel {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int j = ler.nextInt();
        String[] nomes = new String[j];

        int comporta = 0;
        for (int i = 0; i < j; i++) {
            String comportamento = ler.next();
            if (comportamento.equals("+")) {
                comporta++;
            }
            nomes[i] = ler.next();
        }

        Arrays.sort(nomes);

        for (String nome : nomes) {
            System.out.println(nome);
        }

        System.out.println("Se comportaram: " + comporta + " | Nao se comportaram: " + (j - comporta));
    }
}
