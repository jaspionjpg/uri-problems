package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri2651_LinkBolado {

    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);

        String palavra = ler.nextLine();

        if(palavra.toLowerCase().contains("zelda")){
            System.out.println("Link Bolado");
        } else {
            System.out.println("Link Tranquilo");
        }
    }
}
