package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2167_FalhaDoMotor {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        int total = 0;
        boolean asdf = true;
        for (int i = 1; i <= n; i++) {
            int j = ler.nextInt();
            if (j < total) {
                System.out.println(i);
                asdf = false;
                break;
            }
            total = j;
        }
        if (asdf) {
            System.out.println(0);
        }
    }
}
