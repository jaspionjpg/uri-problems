package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2152_PepeJaTireiAVela {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();
            int l = ler.nextInt();
            int k = ler.nextInt();
            String finala = "";
            if (j > 9) {
                finala += j + ":";
            } else {
                finala += "0" + j + ":";
            }
            if (l > 9) {
                finala += l;
            } else {
                finala += "0" + l;
            }
            if (k == 1) {
                finala += " - A porta abriu!";
            } else {
                finala += " - A porta fechou!";
            }

            System.out.println(finala);
        }
    }
}
