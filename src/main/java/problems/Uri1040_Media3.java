package problems;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Uri1040_Media3 {

    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.US);

        Scanner ler = new Scanner(System.in);

        float n1, n2, n3, n4, media;

        String num = ler.nextLine();
        String[] nums = num.split(" ");

        n1 = Float.parseFloat(nums[0]) * 2;
        n2 = Float.parseFloat(nums[1]) * 3;
        n3 = Float.parseFloat(nums[2]) * 4;
        n4 = Float.parseFloat(nums[3]);

        media = (n1 + n2 + n3 + n4) / 10;
        System.out.printf("Media: %.1f\n", media);

        if (media >= 7.0) {
            System.out.printf("Aluno aprovado.\n");
        } else if (media < 5.0) {
            System.out.printf("Aluno reprovado.\n");
        } else {
            System.out.printf("Aluno em exame.\n");
            float exame = Float.parseFloat(ler.nextLine());
            System.out.printf("Nota do exame: %.1f\n", exame);

            media = (media + exame) / 2;

            if (media >= 5.0) {
                System.out.printf("Aluno aprovado.\n");
            } else {
                System.out.printf("Aluno reprovado.\n");
            }
            System.out.printf("Media final: %.1f\n", media);
        }
    }
}
