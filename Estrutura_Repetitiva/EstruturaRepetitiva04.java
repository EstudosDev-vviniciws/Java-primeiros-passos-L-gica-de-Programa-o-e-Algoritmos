package Estrutura_Repetitiva;
import java.util.Scanner;

public class EstruturaRepetitiva04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int soma = 0;

        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            soma += x;
        }

        System.out.println("A soma dos números é: " + soma);

        scanner.close();
    }
    
}
