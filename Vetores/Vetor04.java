package Vetores;
import java.util.Scanner;

public class Vetor04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        String[] nomes = new String[N];
        int[] idades = new int[N];
        double[] alturas = new double[N];

         for (int i = 0; i < N; i++) {
            nomes[i] = scanner.next();
            idades[i] = scanner.nextInt();
            alturas[i] = scanner.nextDouble();
         }

         double soma = 0.0;
         for (int i = 0; i < N; i++) {
            soma += alturas[i];
         }
         double media = soma / N;
         System.out.printf("Altura média: %.2f%%%n ", media);

         int cont = 0;
         for (int i = 0; i < N; i++) {
            if (idades[i] < 16) {
                cont += 1;
            }
         }
         double x = cont * 100.0 / N;
         System.out.printf("Pessoas com menos de 16 anos: %.2f%n", x);

        scanner.close();
    }
    
}
