package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1068_BalancoDeParentesesI {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            String linha = ler.nextLine();
            int tamanho = linha.length();

            int j = 0;

            for (int i = 0; i < tamanho; ++i) {
                if (linha.charAt(i) == '(')
                    j++;
                if (linha.charAt(i) == ')') {
                    if (j == 0) {
                        j = 1;
                        break;
                    }
                    j--;
                }
            }

            if (j == 0) {
                System.out.println("correct");
            } else {
                System.out.println("incorrect");
            }
        }
    }
}
