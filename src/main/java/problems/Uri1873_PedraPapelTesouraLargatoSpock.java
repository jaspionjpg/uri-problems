package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1873_PedraPapelTesouraLargatoSpock {

    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        String a, b;

        for (int i = 0; i < n; i++) {
            a = ler.next();
            b = ler.next();
            if (a.equals(b)) {
                System.out.println("empate");
            } else if (a.equals("tesoura") && b.equals("papel")) {
                System.out.println("rajesh");
            } else if (a.equals("papel") && b.equals("pedra")) {
                System.out.println("rajesh");
            } else if (a.equals("pedra") && b.equals("lagarto")) {
                System.out.println("rajesh");
            } else if (a.equals("lagarto") && b.equals("spock")) {
                System.out.println("rajesh");
            } else if (a.equals("spock") && b.equals("tesoura")) {
                System.out.println("rajesh");
            } else if (a.equals("tesoura") && b.equals("lagarto")) {
                System.out.println("rajesh");
            } else if (a.equals("lagarto") && b.equals("papel")) {
                System.out.println("rajesh");
            } else if (a.equals("papel") && b.equals("spock")) {
                System.out.println("rajesh");
            } else if (a.equals("spock") && b.equals("pedra")) {
                System.out.println("rajesh");
            } else if (a.equals("pedra") && b.equals("tesoura")) {
                System.out.println("rajesh");
            } else System.out.println("sheldon");
        }
    }
}
