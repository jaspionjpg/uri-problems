package problems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri2174_ColecaoDePomekon {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();
        Map<String, Integer> pokemons = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String pokemon = ler.next();

            if (!pokemons.containsKey(pokemon)) {
                pokemons.put(pokemon, i);
            }
        }

        int total = 151 - pokemons.size();
        System.out.println("Falta(m) " + total + " pomekon(s).");
    }
}
