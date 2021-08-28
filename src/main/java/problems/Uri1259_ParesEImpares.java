package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Uri1259_ParesEImpares {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        List<Integer> pares = new ArrayList<Integer>();
        List<Integer> impares = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();

            if (j % 2 == 0) {
                pares.add(j);
            } else {
                impares.add(j);
            }

        }
        sortimpares(pares);
        sortAutoComplete(impares);

        for (int i = 0; i < pares.size(); i++) {
            System.out.println(pares.get(i));
        }
        for (int i = 0; i < impares.size(); i++) {
            System.out.println(impares.get(i));
        }
    }

    public static void sortAutoComplete(List<Integer> preferencia2) {
        Collections.sort(preferencia2, (auto2, auto1) -> auto1 - auto2);
    }

    public static void sortimpares(List<Integer> preferencia2) {
        Collections.sort(preferencia2, (auto2, auto1) -> auto2 - auto1);
    }

}
