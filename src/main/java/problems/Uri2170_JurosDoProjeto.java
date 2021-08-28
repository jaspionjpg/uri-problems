package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2170_JurosDoProjeto {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i = 1;
        while (ler.hasNextInt()) {
            double k = ler.nextLong();
            double j = ler.nextLong();
            System.out.println("Projeto " + i + ":");
            System.out.printf("Percentual dos juros da aplicacao: %.02f ", (j / k) * 100 - 100);
            System.out.println("%");
            i++;
        }
    }
}
