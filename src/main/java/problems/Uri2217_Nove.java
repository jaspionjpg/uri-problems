package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2217_Nove {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {

            int j = ler.nextInt();
            if (j % 2 == 0) {
                System.out.println("1");
            } else {
                System.out.println("9");
            }
        }
    }
}
