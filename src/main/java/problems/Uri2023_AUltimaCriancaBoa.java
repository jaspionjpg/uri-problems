package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri2023_AUltimaCriancaBoa {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        List<String> lista = new ArrayList<String>();
        List<String> listaPequena = new ArrayList<>();
        while (ler.hasNext()) {
            lista.add(ler.nextLine());
            listaPequena.add(lista.get(lista.size() - 1).toLowerCase());
        }
        Collections.sort(listaPequena);

        for (String nome : lista) {
            if (nome.toLowerCase().equals(listaPequena.get(listaPequena.size() - 1)))
                System.out.println(nome);
        }
    }
}
