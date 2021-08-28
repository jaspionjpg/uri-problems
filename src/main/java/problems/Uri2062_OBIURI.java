package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2062_OBIURI {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        String finalf = "";
        while (n-- > 0) {
            String palavra = ler.next();

            if (palavra.contains("OB") && palavra.length() == 3) {
                finalf += " OBI";
            } else if (palavra.contains("UR") && palavra.length() == 3) {
                finalf += " URI";
            } else {
                finalf += " " + palavra;
            }
        }

        System.out.println(finalf.trim());
    }
}
