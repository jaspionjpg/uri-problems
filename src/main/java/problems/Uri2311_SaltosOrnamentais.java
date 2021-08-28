package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri2311_SaltosOrnamentais {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            String nome = ler.next();
            List<Double> lista = new ArrayList<>();
            double notamultiplicadora = ler.nextDouble();
            for (int j = 0; j < 7; j++) {
                double nota = ler.nextDouble();
                lista.add(nota);
            }
            double maiorNota = getMaior(lista);
            double menorNota = getMenor(lista);

            float total = somaLista(lista, menorNota, maiorNota);
            System.out.printf(nome + " %.2f\n", total * notamultiplicadora);
        }
    }

    public static float somaLista(List<Double> lista, double min, double max) {
        float total = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) != min && lista.get(i) != max)
                total += lista.get(i);
        }
        return total;
    }

    public static Double getMaior(List<Double> lista) {
        double max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > max)
                max = lista.get(i);
        }
        return max;
    }

    public static Double getMenor(List<Double> lista) {
        double min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) < min)
                min = lista.get(i);
        }
        return min;
    }
}
