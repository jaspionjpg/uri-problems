package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1004_ProdutoSimples {

    public static void main(String[] args) throws IOException {
        int a;
        int b;
        int prod;
        Scanner ler = new Scanner(System.in);

        a = ler.nextInt();
        b = ler.nextInt();

        prod = a * b;

        System.out.println("" + "PROD = " + prod);
    }
}
