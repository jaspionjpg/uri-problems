package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1238_Combinador {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            String a1 = ler.next();
            String a2 = ler.next();

            int o = Math.max(a1.length(), a2.length());
            String valorfinal = "";
            for (int j = 0; j < o; j++) {
                if (j < a1.length()) {
                    valorfinal = valorfinal + a1.charAt(j);
                }
                if (j < a2.length()) {
                    valorfinal = valorfinal + a2.charAt(j);
                }
            }
            System.out.println(valorfinal);
        }
    }
}
