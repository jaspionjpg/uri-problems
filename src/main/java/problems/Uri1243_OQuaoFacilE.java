package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1243_OQuaoFacilE {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String linha = "";

        while (ler.hasNextLine()) {
            linha = ler.nextLine();
            int media = 0;
            int simbolos = 0;
            String[] palavras = linha.split(" ");

            for (int i = 0; i < palavras.length; i++) {
                if (temnumero(palavras[i]))
                    if (!palavras[i].contains(".")) {
                        media += palavras[i].length();
                        simbolos++;
                    } else if (passa(palavras[i])) {
                        simbolos++;
                        media += palavras[i].replace(".", "").length();
                    }
            }
            if (simbolos == 0) {
                simbolos = 1;
            }
            media = (int) Math.ceil(media / simbolos);

            if (media <= 3) {
                System.out.println(250);
            } else if (media <= 5) {
                System.out.println(500);
            } else {
                System.out.println(1000);
            }
        }
    }


    private static boolean passa(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == '.') {
                if (texto.length() - 1 == i && texto.length() > 1) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    private static boolean temnumero(String texto) {
        for (char letra : texto.toCharArray())
            if (letra >= '0' && letra <= '9') {
                return false;
            }
        return true;
    }
}
