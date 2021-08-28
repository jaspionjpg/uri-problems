package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1766_ElfoDasTrevas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int numero = ler.nextInt();

        for (int i = 0; i < numero; i++) {

            List<Rena> lista = new ArrayList<>();

            int j = ler.nextInt();
            int k = ler.nextInt();

            while (j-- > 0) {
                String nome = ler.next();
                Integer peso = ler.nextInt();
                Integer idade = ler.nextInt();
                Double altura = ler.nextDouble();

                lista.add(new Rena(nome, peso, idade, altura));
            }

            lista.sort((o1, o2) -> {
                if (o1.peso != o2.peso) {
                    return Integer.compare(o2.peso, o1.peso);
                } else if (o1.idade != o2.idade) {
                    return Integer.compare(o1.idade, o2.idade);
                } else if (o1.altura != o2.altura) {
                    return Double.compare(o1.altura, o2.altura);
                } else {
                    return o1.nome.compareToIgnoreCase(o2.nome);
                }
            });

            System.out.println("CENARIO {" + (i + 1) + "}");
            for (int m = 0; m < k; m++) {
                System.out.println((m + 1) + " - " + lista.get(m).nome);
            }
        }
    }
}

class Rena {
    String nome;
    int peso;
    int idade;
    Double altura;

    public Rena(String nome, int peso, int idade, Double altura) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.altura = altura;
    }
}