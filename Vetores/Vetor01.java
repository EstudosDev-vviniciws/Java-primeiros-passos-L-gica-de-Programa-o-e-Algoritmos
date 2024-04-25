package Vetores;
import java.util.Scanner;

public class Vetor01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            vet[i] = scanner.nextDouble();
        }

        for (int i = 0; i < N; i++) {
            System.out.printf("%.2f%n", vet[i]);
        }
        scanner.close();
    }
    
}
