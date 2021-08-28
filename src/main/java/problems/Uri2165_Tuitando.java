package problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Uri2165_Tuitando {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String asdf = in.readLine();

        if (asdf.length() > 140) {
            System.out.println("MUTE");
        } else {
            System.out.println("TWEET");
        }
    }
}
