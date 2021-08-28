package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1875_Tribol {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int n = ler.nextInt();

        for (int i = 0; i < n; i++) {
            int k = ler.nextInt();

            int blue = 0;
            int red = 0;
            int green = 0;

            for (int j = 0; j < k; j++) {
                String marcou = ler.next();
                String sofreu = ler.next();

                if (marcou.equals("G")) {
                    if (sofreu.equals("R")) {
                        green++;
                    } else {
                        green++;
                        green++;
                    }
                } else if (marcou.equals("R")) {
                    if (sofreu.equals("B")) {
                        red++;
                    } else {
                        red++;
                        red++;
                    }
                } else if (marcou.equals("B")) {
                    if (sofreu.equals("G")) {
                        blue++;
                    } else {
                        blue++;
                        blue++;
                    }
                }


            }
            if (blue > green && blue > red) {
                System.out.println("blue");
            } else if (green > blue && green > red) {
                System.out.println("green");
            } else if (red > blue && red > green) {
                System.out.println("red");
            } else if (green == red && red == blue) {
                System.out.println("trempate");
            } else if (green == red || red == blue || green == blue) {
                System.out.println("empate");
            }
        }
    }
}
