package problems;

import java.io.IOException;

public class Uri1155_SequenciaS {
    public static void main(String[] args) throws IOException {
        float S = 0;
        for (float i = 1; i <= 100; i++) {
            S += (1 / i);
        }
        System.out.printf("%.2f\n", S);
    }
}
