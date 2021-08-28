package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2126_ProcurandoSubsquencias {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int caso = 1;
        while (ler.hasNext()) {
            String numeros = ler.next();
            String sequencia = ler.next();

            int ultimaSequencia = sequencia.lastIndexOf(numeros) + 1;

            if (ultimaSequencia > 0) {
                sequencia = sequencia.replace(numeros, "-");

                System.out.println("Caso #" + caso + ":");
                System.out.println("Qtd.Subsequencias: " + getNumeroDeSequencias(sequencia));
                System.out.println("Pos: " + ultimaSequencia);
                System.out.println();
            } else {
                System.out.println("Caso #" + caso + ":");
                System.out.println("Nao existe subsequencia");
                System.out.println();
            }
            caso++;
        }
    }

    public static Integer getNumeroDeSequencias(String sequencia) {
        Integer i = 0;

        for (int n = 0; n < sequencia.length(); n++) {
            if (sequencia.charAt(n) == '-') {
                i++;
            }
        }
        return i;
    }

}
