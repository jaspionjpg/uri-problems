package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1542_LendoLivros {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int j;
		while((j = ler.nextInt()) != 0){
			
			int n = ler.nextInt();
			int k = ler.nextInt();
			
			int total = ((j*n*k)/(j-k))-((j*n*k)/(j-k))*2;
			if(total > 1 ){
				System.out.println(total+ " paginas");			
				
			} else {
				System.out.println(total+ " pagina");			
				
			}
		}
	}
}
