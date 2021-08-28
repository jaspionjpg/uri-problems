package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2242_Huaauhahhuahau {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String risada = ler.next();
        StringBuffer risadavogais = new StringBuffer();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};

        for (int i = 0; i < risada.length(); i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (risada.charAt(i) == vogais[j]) {
                    risadavogais.append(risada.charAt(i));
                }
            }
        }

        StringBuffer risadareversa = new StringBuffer(risadavogais).reverse();

        if (risadareversa.toString().equals(risadavogais.toString())) {
            System.out.println("S");

        } else {
            System.out.println("N");
        }

    }
}
