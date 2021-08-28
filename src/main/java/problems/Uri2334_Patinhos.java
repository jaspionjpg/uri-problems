package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2334_Patinhos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Long numero;
        while ((numero = ler.nextLong()) != -1d) {
            System.out.println("" + (numero == 0 ? 0 : numero - 1));
        }
    }
}
