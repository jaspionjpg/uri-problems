package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1984_OEnigmaPronalandia {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        String n = ler.next();
        String finaaal = "";

        for (int i = n.length() - 1; 0 <= i; i--) {
            finaaal += n.charAt(i);
        }
        System.out.println(finaaal);
    }
}
