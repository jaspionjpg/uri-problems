package problems;

import java.util.Scanner;

public class Uri2310_Voleibol {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n = ler.nextInt();
        double saques = 0;
        double bloqueios = 0;
        double ataques = 0;
        double saquescertos = 0;
        double bloqueioscertos = 0;
        double ataquescertos = 0;

        for (int i = 0; i < n; i++) {
            String asdf = ler.next();
            saques += ler.nextInt();
            bloqueios += ler.nextInt();
            ataques += ler.nextInt();
            saquescertos += ler.nextInt();
            bloqueioscertos += ler.nextInt();
            ataquescertos += ler.nextInt();
        }

        System.out.printf("Pontos de Saque: %.2f ", new Float(saquescertos / saques) * 100);
        System.out.println("%.");
        System.out.printf("Pontos de Bloqueio: %.2f ", new Float(bloqueioscertos / bloqueios) * 100);
        System.out.println("%.");
        System.out.printf("Pontos de Ataque: %.2f ", new Float(ataquescertos / ataques) * 100);
        System.out.println("%.");
    }
}
