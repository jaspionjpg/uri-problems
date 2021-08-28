package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1192_OJogoMatematicoDePaula {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            String situacao = ler.next();
            if (situacao.charAt(2) == situacao.charAt(0)) {
                System.out.println(Integer.parseInt(situacao.charAt(0) + "") * Integer.parseInt(situacao.charAt(0) + ""));
            } else if (Character.isLowerCase(situacao.charAt(1))) {
                System.out.println(Integer.parseInt(situacao.charAt(0) + "") + Integer.parseInt(situacao.charAt(2) + ""));
            } else {
                System.out.println(Integer.parseInt(situacao.charAt(2) + "") - Integer.parseInt(situacao.charAt(0) + ""));

            }
        }
    }
}
