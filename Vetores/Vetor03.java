package Vetores;
import java.util.Scanner;

public class Vetor03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            vet[i] = scanner.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            System.out.print(vet[i] + " ");
        }
        System.out.println();

        double soma = 0.0;
        for (int i = 0; i < N; i++) {
            soma += vet[i];
        }
        System.out.printf("%.2f%n", soma);

        double media = soma / N;
        System.out.printf("%.2f%n", media);
        scanner.close();
        }
}
    


