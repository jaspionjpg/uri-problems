package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uri2633_ChurrasNoYuri {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            int numero = ler.nextInt();

            List<Carne> carnes = new ArrayList<Carne>();

            for (int i = 0; i < numero; i++) {
                String nome = ler.next();
                int numer = ler.nextInt();

                carnes.add(new Carne(nome, numer));
            }

            carnes.sort(Comparator.comparingInt(o -> o.number));

            String resultado = "";
            for (Carne carne : carnes) {
                resultado += carne.nome + " ";
            }
            System.out.println(resultado.trim());
        }
    }
}

class Carne {
    String nome;
    int number;

    public Carne(String nome, int number) {
        this.nome = nome;
        this.number = number;
    }
}
