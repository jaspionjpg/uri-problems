package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1930_Tomadas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int resultado = 0;
        for (int i = 0; i < 4; i++) {
            int j = ler.nextInt();
            resultado += j;
        }
        System.out.println(resultado - 3);
    }
}
