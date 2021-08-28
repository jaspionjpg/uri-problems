package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Uri1581_ConversaInternacional {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        for (int i = 0; i < n; i++) {

            int l = ler.nextInt();
            List<String> lista = new ArrayList<>();
            for (int j = 0; j < l; j++) {

                String asdf = ler.next();

                if (!lista.contains(asdf)) {
                    lista.add(asdf);
                }
            }
            if (lista.size() == 1) {
                System.out.println(lista.get(0));
            } else {
                System.out.println("ingles");
            }
        }
    }
}
