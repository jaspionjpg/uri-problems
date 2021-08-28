package problems;

import java.io.IOException;

public class Uri1097_SequenciaIJ3 {

    public static void main(String[] args) throws IOException {
        for (int i = 1, j = 7; i <= 9; i += 2, j += 2) {
            System.out.print("I=" + i + " J=" + j + "\n");
            System.out.print("I=" + i + " J=" + (j - 1) + "\n");
            System.out.print("I=" + i + " J=" + (j - 2) + "\n");
        }
    }
}
