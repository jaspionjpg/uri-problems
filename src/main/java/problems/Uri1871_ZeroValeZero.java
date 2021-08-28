package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1871_ZeroValeZero {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int m, n;
        String s;

        while (in.hasNextLine()) {
            m = in.nextInt();
            n = in.nextInt();

            if (m == 0 && n == 0) {
                break;
            }

            s = Integer.toString(m + n);
            s = s.replace("0", "");
            System.out.println(s);
        }
    }
} 

