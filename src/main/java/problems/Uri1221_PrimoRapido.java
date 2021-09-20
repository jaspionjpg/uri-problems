package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1221_PrimoRapido {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n, x;
        boolean ver = false;

        n = ler.nextInt();

        for (int i = 0; i < n; ++i) {
            x = ler.nextInt();

            if (x == 2) {
                System.out.println("Prime");
            } else {

                if (x % 2 == 0) {
                    System.out.println("Not Prime");
                } else {

                    for (int j = 3; j < Math.sqrt(x); j += 2) {
                        if (x % j == 0)
                            ver = true;
                    }

                    if (ver == true) {
                        System.out.println("Not Prime");
                    } else {
                        System.out.println("Prime");
                    }
                }
            }

            ver = false;
        }

    }
}
