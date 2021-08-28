package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri2160_NomeNoFormulario {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String asdf = in.readLine();

        if (asdf.length() > 80) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
