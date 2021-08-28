package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2146_Senha {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNextInt()) {
            int n = ler.nextInt();
            System.out.println(n - 1);
        }
    }
}
