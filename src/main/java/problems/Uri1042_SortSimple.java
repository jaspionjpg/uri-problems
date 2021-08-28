package problems;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Uri1042_SortSimple {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n1 = ler.nextInt();
        int n2 = ler.nextInt();
        int n3 = ler.nextInt();

        List<Integer> list = new ArrayList<Integer>();
        list.add(n1);
        list.add(n2);
        list.add(n3);

        sortAutoComplete(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

    public static void sortAutoComplete(List<Integer> preferencia2) {
        Collections.sort(preferencia2, new Comparator<Integer>() {
            @Override
            public int compare(Integer auto2, Integer auto1) {
                return auto2 - auto1;
            }
        });
    }
}
