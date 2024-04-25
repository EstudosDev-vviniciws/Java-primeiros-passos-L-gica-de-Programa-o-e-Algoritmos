package Vetores;
import java.util.Scanner;

public class Vetor02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double[] vet = new double[N];

        for (int i = 0; i < N; i++) {
            vet[i] = scanner.nextDouble();
        }
        for (int i = 0; i < N; i++) {
            if (vet[i] < 0) {
                System.out.println(vet[i]); 
            }
        }
        scanner.close();
    }
}
