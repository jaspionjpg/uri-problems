package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2144_Bodybuilder {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        double w1;
        double w2;
        double r;
        List<Double> lista = new ArrayList<Double>();
        while ((w1 = ler.nextInt()) != 0 && (w2 = ler.nextInt()) != 0 && (r = ler.nextInt()) != 0) {

            double esq = w1 * (1 + r / 30);
            double dir = w2 * (1 + r / 30);

            double d = (esq + dir) / 2;
            lista.add(d);

            if (d < 13) {
                System.out.println("Nao vai da nao");
            } else if (d < 14) {
                System.out.println("E 13");
            } else if (d < 40) {
                System.out.println("Bora, hora do show! BIIR!");
            } else if (d <= 60) {
                System.out.println("Ta saindo da jaula o monstro!");
            } else {
                System.out.println("AQUI E BODYBUILDER!!");
            }

        }
        double media = 0;
        for (double num : lista) {
            media += num;
        }
        if (media / lista.size() > 40) {
            System.out.println("");
            System.out.println("Aqui nois constroi fibra rapaz! Nao e agua com musculo!");
        }
    }
}
