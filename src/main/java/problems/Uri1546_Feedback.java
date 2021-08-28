package problems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1546_Feedback {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        Map<Integer, String> mapinha = new HashMap<Integer, String>();
        mapinha.put(1, "Rolien");
        mapinha.put(2, "Naej");
        mapinha.put(3, "Elehcim");
        mapinha.put(4, "Odranoel");

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int j = ler.nextInt();

            for (int l = 0; l < j; l++) {
                int m = ler.nextInt();
                System.out.println(mapinha.get(m));
            }
        }
    }
}
