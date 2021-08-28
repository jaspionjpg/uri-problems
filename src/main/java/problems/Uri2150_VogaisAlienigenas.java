package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri2150_VogaisAlienigenas {
    public static void main(String[] args) throws IOException {
        BufferedReader ler = new BufferedReader(new InputStreamReader(System.in));
        String vogais;
        while ((vogais = ler.readLine()) != null) {
            if (vogais.replace(" ", "").equals(""))
                break;

            String Frase = ler.readLine();
            long total = 0;
            for (long i = 0; i < vogais.length(); i++) {
                for (long j = 0; j < Frase.length(); j++) {
                    if (Frase.charAt((int) j) == vogais.charAt((int) i)) {
                        total++;
                    }
                }
            }
            System.out.println(total);
        }
    }
}
