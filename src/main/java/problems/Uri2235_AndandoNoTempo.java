package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2235_AndandoNoTempo {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int[] n = new int[3];
        n[0] = ler.nextInt();
        n[1] = ler.nextInt();
        n[2] = ler.nextInt();

        boolean bo = false;

        if (n[0] == 0)
            bo = true;
        if (n[1] == 0)
            bo = true;
        if (n[2] == 0)
            bo = true;

        if (n[0] + n[1] - n[2] == 0)
            bo = true;
        if (n[1] + n[2] - n[0] == 0)
            bo = true;
        if (n[0] + n[2] - n[1] == 0)
            bo = true;

        if (n[0] - n[1] - n[2] == 0)
            bo = true;
        if (n[1] - n[2] - n[0] == 0)
            bo = true;
        if (n[2] - n[0] - n[1] == 0)
            bo = true;

        if (n[0] - n[1] == 0)
            bo = true;
        if (n[0] - n[2] == 0)
            bo = true;
        if (n[1] - n[2] == 0)
            bo = true;

        if (bo) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

    }
}
