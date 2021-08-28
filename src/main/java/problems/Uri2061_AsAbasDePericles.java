package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2061_AsAbasDePericles {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int j = ler.nextInt();
        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {
            String a = ler.next();

            if (a.equals("fechou")) {
                j++;
            } else if (a.equals("clicou")) {
                j--;
            }
        }
        System.out.println(j);
    }
}
