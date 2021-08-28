package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2650_ConstruindoMuralhas {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String[] y = ler.nextLine().split(" ");
        int quantid = Integer.parseInt(y[0]);
        int tamanho = Integer.parseInt(y[1]);

        for (int i = 0; i < quantid; i++) {
            String linhae = ler.nextLine();
            String[] linha = linhae.split(" ");
            if (Integer.parseInt(linha[linha.length - 1]) > tamanho) {
                System.out.println(linhae.substring(0, linhae.lastIndexOf(" ")));
            }
        }
    }
}
