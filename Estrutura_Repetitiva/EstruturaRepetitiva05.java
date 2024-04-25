package Estrutura_Repetitiva;
import java.util.Scanner;

public class EstruturaRepetitiva05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N;

        System.out.println("Digite o valor de N: ");
        N = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            int resultado = i * N;
            System.out.println(i + " x " + N + " = " + resultado);
        }
        scanner.close();
    }
    
}
