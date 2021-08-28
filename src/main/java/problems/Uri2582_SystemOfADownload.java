package problems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri2582_SystemOfADownload {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        Integer y = ler.nextInt();

        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(0, "PROXYCITY");
        mapa.put(1, "P.Y.N.G.");
        mapa.put(2, "DNSUEY!");
        mapa.put(3, "SERVERS");
        mapa.put(4, "HOST!");
        mapa.put(5, "CRIPTONIZE");
        mapa.put(6, "OFFLINE DAY");
        mapa.put(7, "SALT");
        mapa.put(8, "ANSWER!");
        mapa.put(9, "RAR?");
        mapa.put(10, "WIFI ANTENNAS");

        for (int i = 0; i < y; i++) {
            Integer z = ler.nextInt();
            z = z + ler.nextInt();

            System.out.println(mapa.get(z));
        }
    }
}
