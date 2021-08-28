package problems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri2486_CMaisOuMenos {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int repeticoes = 0;

        Map<String, Integer> mg = new HashMap<String, Integer>();
        mg.put("suco de laranja", 120);
        mg.put("morango fresco", 85);
        mg.put("mamao", 85);
        mg.put("goiaba vermelha", 70);
        mg.put("manga", 56);
        mg.put("laranja", 50);
        mg.put("brocolis", 34);

        while ((repeticoes = Integer.valueOf(ler.nextLine())) != 0) {
            int mgs = 0;
            for (int i = 0; i < repeticoes; i++) {
                String[] informacoes = ler.nextLine().split(" ", 2);
                mgs = mgs + mg.get(informacoes[1]) * Integer.valueOf(informacoes[0]);
            }

            if (mgs < 110) {
                System.out.println("Mais " + (110 - mgs) + " mg");
            } else if (mgs > 130) {
                System.out.println("Menos " + (mgs - 130) + " mg");
            } else {
                System.out.println(mgs + " mg");
            }
        }
    }
}
