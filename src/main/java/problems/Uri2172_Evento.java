package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2172_Evento {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n;
        int j;
        while ((n = ler.nextInt()) != 0 && (j = ler.nextInt()) != 0) {
            System.out.println(n * j);
        }
    }
}
