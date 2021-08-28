package problems;

import java.io.IOException;
import java.util.*;

public class Uri2137_ABiliotecaDoSenhorSeverino {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {
            List<Classe> lista = new ArrayList<>();
            int n = ler.nextInt();
            for (int i = 0; i < n; i++) {
                String numero = ler.next();
                lista.add(new Classe(numero));
            }
            sortAutoComplete(lista);

            for (Classe classe : lista) {
                System.out.println(classe.numeroLeitura);
            }

        }
    }

    public static void sortAutoComplete(List<Classe> preferencia2) {
        Collections.sort(preferencia2, Comparator.comparingInt(auto2 -> auto2.numero));
    }
}

class Classe{
    int numero;
    String numeroLeitura;
    Classe(String numeroLeitura){
        this.numeroLeitura = numeroLeitura;
        numero = Integer.parseInt(numeroLeitura);
    }
}