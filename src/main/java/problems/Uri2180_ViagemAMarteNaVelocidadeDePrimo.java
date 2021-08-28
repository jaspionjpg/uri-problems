package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2180_ViagemAMarteNaVelocidadeDePrimo {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        int montante = 0;
        int repe = 0;
        int acre = 0;
        List<Integer> asdf = new ArrayList<Integer>();
        while (repe < 10) {
            boolean ePrimo = true;
            ePrimo = ePrimos(n + acre);
            if (ePrimo) {
                montante = montante + n + acre;
                repe++;
                asdf.add(n + acre);
            }
            acre++;
        }

        int horas = 60000000 / montante;
        int dias = horas / 24;
        System.out.println(montante + " km/h");
        System.out.println(horas + " h / " + dias + " d");
    }

    public static boolean ePrimos(int n) {
        boolean ePrimo = true;
        for (int p = n - 1; p > 1; p--) {
            if (n % p == 0) {
                ePrimo = false;
            }
        }
        return ePrimo;
    }
}
