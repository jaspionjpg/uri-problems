package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uri1171_FrequenciaDeNumeros {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        List<NumeroRepeticoes> lista = new ArrayList<NumeroRepeticoes>();
        for (int i = 0; i < n; i++) {

            int j = ler.nextInt();
            boolean asdf = true;
            for (int k = 0; k < lista.size(); k++) {
                if (lista.get(k).getI() == j) {
                    asdf = false;
                    lista.get(k).setRepeticoes(lista.get(k).getRepeticoes() + 1);
                }
            }
            if (asdf) {
                lista.add(new NumeroRepeticoes(j));
            }

        }
        sortAutoComplete(lista);

        for (NumeroRepeticoes num : lista) {
            System.out.println(num.getI() + " aparece " + num.getRepeticoes() + " vez(es)");
        }
    }

    public static void sortAutoComplete(List<NumeroRepeticoes> preferencia2) {
        Collections.sort(preferencia2, new Comparator<NumeroRepeticoes>() {

            @Override
            public int compare(NumeroRepeticoes auto2, NumeroRepeticoes auto1) {
                return auto2.getI() - auto1.getI();
            }
        });
    }
}

class NumeroRepeticoes {
    int i;
    int repeticoes = 1;

    public NumeroRepeticoes(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getRepeticoes() {
        return repeticoes;
    }

    public void setRepeticoes(int repeticoes) {
        this.repeticoes = repeticoes;
    }
}
