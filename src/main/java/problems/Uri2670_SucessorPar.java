package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2670_SucessorPar {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int y = ler.nextInt();
        if (y % 2 == 0) {
            y += 2;
        } else {
            y++;
        }
        System.out.println(y);
    }
}
