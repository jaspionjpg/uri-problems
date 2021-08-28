package problems;

import java.io.IOException;
import java.util.Scanner;

public class Uri1253_CifraDeCesar {
	public static void main(String[] args) throws IOException{
		Scanner ler = new Scanner(System.in);
		String linha = "";
		int maior = ler.nextInt();
		for(int i = 0 ; i < maior; i++){
			linha = ler.next();
			int numeroafrente = ler.nextInt();
			
			for (char letra : linha.toCharArray()) 
				if(letra > 64 && letra < 91){
					if(letra - numeroafrente < 65){
						letra = (char) (letra - numeroafrente + 90 - 64);
					} else {
						letra = (char) (letra - numeroafrente);
					}
					System.out.print(letra);
				} 		
			System.out.println();
		}
	}
}
