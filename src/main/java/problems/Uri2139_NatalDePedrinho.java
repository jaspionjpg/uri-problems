package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2139_NatalDePedrinho {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int diasNoAno = 366;

        while (ler.hasNext()) {

            int mes = ler.nextInt();
            int dia = ler.nextInt();

            if (mes == 12 && dia == 25) {
                System.out.println("E natal!");
            } else if (mes == 12 && dia == 24) {
                System.out.println("E vespera de natal!");
            } else if (mes == 12 && dia > 25) {
                System.out.println("Ja passou!");
            } else {

                int diasPassados = diasNoAno - (6 + dia + getDiasDeMesesPassados(mes - 1));
                System.out.println("Faltam " + diasPassados + " dias para o natal!");
            }
        }
    }

    public static Integer getDiasDeMesesPassados(int i) {
        int[] meses = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        int j = 0;
        for (int n = 0; n < i; n++) {
            j += meses[n];
        }
        return j;
    }


}
