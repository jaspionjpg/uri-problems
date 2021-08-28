package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1387_Og {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n;
        int j;
        do {
            n = ler.nextInt();
            j = ler.nextInt();
            if (n != 0 && j != 0)
                System.out.println(n + j);
        } while (n != 0 && j != 0);
    }
}
