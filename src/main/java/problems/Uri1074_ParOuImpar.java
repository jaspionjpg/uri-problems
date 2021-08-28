package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1074_ParOuImpar {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            String retorno = "";
            if (j == 0) {
                retorno += "NULL";
            } else {
                if ((j % 2) != 0) {
                    retorno += "ODD ";
                } else {
                    retorno += "EVEN ";
                }
                if (j > 0) {
                    retorno += "POSITIVE";
                } else {
                    retorno += "NEGATIVE";
                }
            }
            System.out.println(retorno);
        }
    }
}
