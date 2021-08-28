package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1041_CoordenadasDePonto {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        float x, y;

        x = input.nextFloat();
        y = input.nextFloat();

        if (x == 0.0 && y == 0.0) {
            System.out.print("Origem\n");
        } else if (x == 0.0 && y != 0.0) {
            System.out.print("Eixo Y\n");
        } else if (y == 0.0 && x != 0.0) {
            System.out.print("Eixo X\n");
        } else if (x > 0.0 && y > 0.0) {
            System.out.print("Q1\n");
        } else if (x < 0.0 && y < 0.0) {
            System.out.print("Q3\n");
        } else if (x < 0.0 && y > 0.0) {
            System.out.print("Q2\n");
        } else {
            System.out.print("Q4\n");
        }

    }

}
