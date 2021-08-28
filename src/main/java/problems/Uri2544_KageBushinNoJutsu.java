package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2544_KageBushinNoJutsu {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        while (ler.hasNext()) {
            Integer y = ler.nextInt();
            int x = 0;

            while (y != 1) {
                x++;
                y = y / 2;
            }
            System.out.println(x);
        }
    }
}
