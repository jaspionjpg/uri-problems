package problems;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Uri2164_FibonacciRapido {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int i = ler.nextInt();
        double asdf = (Math.pow(((1 + Math.sqrt(5)) / 2), i) - Math.pow(((1 - Math.sqrt(5)) / 2), i)) / Math.sqrt(5);
        DecimalFormat formato = new DecimalFormat("#.0");
        System.out.println(formato.format(asdf));
    }
}
