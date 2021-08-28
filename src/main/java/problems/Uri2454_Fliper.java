package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2454_Fliper {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int j = ler.nextInt();
        int k = ler.nextInt();

        if (j == 0) {
            System.out.println("C");
        } else if (k == 0) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
    }
}
