package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Uri1281_IdaAFeira {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            Map<String, Integer> mapaNomes = new HashMap<String, Integer>();
            List<Double> list = new ArrayList<>();
            double total = 0;

            int j = ler.nextInt();

            for (int k = 0; k < j; k++) {
                String nome = ler.next();
                double numero = ler.nextDouble();

                mapaNomes.put(nome, k);
                list.add(numero);
            }

            j = ler.nextInt();

            for (int k = 0; k < j; k++) {
                String nome = ler.next();
                int numero = ler.nextInt();
                total += list.get(mapaNomes.get(nome)) * numero;
            }
            DecimalFormat formato = new DecimalFormat("0.00");

            System.out.println("R$ " + formato.format(total));
        }
    }
}
