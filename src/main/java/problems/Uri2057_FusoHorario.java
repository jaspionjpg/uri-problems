package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2057_FusoHorario {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int horaSaida = ler.nextInt();
        int horaTrasporte = ler.nextInt();
        int horaHorarioLocal = ler.nextInt();
        int saida = horaHorarioLocal + horaSaida + horaTrasporte;
        if (saida < 0) {
            saida = 24 + saida;
        }
        System.out.println(saida % 24);
    }
}
