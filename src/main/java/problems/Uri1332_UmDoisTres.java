package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1332_UmDoisTres {
    public static void main(String[] args) throws IOException {
        int n;
        String name;
        Scanner ler = new Scanner(System.in);
        n = ler.nextInt();

        for (int i = 0; i < n; ++i) {
            name = ler.next();

            if (name.length() == 5) {
                System.out.println("3");
            } else {
                if ((name.charAt(0) == 'o' && name.charAt(1) == 'n') ||
                        (name.charAt(0) == 'o' && name.charAt(2) == 'e') ||
                        (name.charAt(1) == 'n' && name.charAt(2) == 'e')) {
                    System.out.println("1");
                } else {
                    System.out.println("2");
                }
            }
        }

    }
}
