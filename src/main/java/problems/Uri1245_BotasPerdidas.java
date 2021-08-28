package problems;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uri1245_BotasPerdidas {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        while (ler.hasNext()) {
            int n = ler.nextInt();

            Map<Integer, calcados> calcados = new HashMap<>();

            for (int i = 0; i < n; i++) {

                int tamanho = ler.nextInt();
                String string = ler.next();

                if (calcados.containsKey(tamanho)) {
                    if (string.equals("D")) {
                        calcados.get(tamanho).addDireito();
                    } else {
                        calcados.get(tamanho).addEsquerdo();
                    }
                } else {
                    if (string.equals("D")) {
                        calcados.put(tamanho, new calcados(1, 0));
                    } else {
                        calcados.put(tamanho, new calcados(0, 1));
                    }
                }
            }

            int k = 0;

            for (calcados calcado : calcados.values()) {
                int p = Math.min(calcado.direitos, calcado.esquerdos);
                if (p != 0) {
                    k += p;
                }
            }
            System.out.println(k);
        }
    }
}

class calcados {
    int direitos;
    int esquerdos;

    public calcados(int direitos, int esquerdos) {
        this.direitos = direitos;
        this.esquerdos = esquerdos;
    }

    public void addDireito() {
        direitos++;
    }

    public void addEsquerdo() {
        esquerdos++;
    }
}
