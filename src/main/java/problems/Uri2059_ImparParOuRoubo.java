package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2059_ImparParOuRoubo {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int i = ler.nextInt();
        int j = ler.nextInt();
        int n = ler.nextInt();
        int l = ler.nextInt();
        int h = ler.nextInt();
        int win = 0;

        int soma = j + n;


        if ((soma % 2 == 0 && i == 1) || (soma % 2 == 1 && i == 0)) {
            win = 1;
        } else {
            win = 2;
        }
        if ((l == 1 && h == 0) || (l == 0 && h == 1)) {
            win = 1;
        } else if (l == 1 && h == 1) {
            win = 2;
        }

        System.out.println("Jogador " + win + " ganha!");
    }
}
