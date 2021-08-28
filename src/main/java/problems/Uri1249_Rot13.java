package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1249_Rot13 {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        String linha = "";
        while (ler.hasNextLine()) {
            linha = ler.nextLine();

            for (char letra : linha.toCharArray())
                if (letra > 96 && letra < 123) {
                    if (letra + 13 > 122) {
                        letra = (char) (letra + 13 - 122 + 96);
                    } else {
                        letra = (char) (letra + 13);
                    }
                    System.out.print(letra);
                } else if (letra > 64 && letra < 91) {
                    if (letra + 13 > 90) {
                        letra = (char) (letra + 13 - 90 + 64);
                    } else {
                        letra = (char) (letra + 13);
                    }
                    System.out.print(letra);
                } else {
                    System.out.print(letra);
                }

            System.out.println();
        }
    }
}
