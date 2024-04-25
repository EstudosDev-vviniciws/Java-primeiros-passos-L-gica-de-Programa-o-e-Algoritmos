package Estrutura_Repetitiva;
import java.util.Scanner;

public class EstruturaRepetitiva03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idade = scanner.nextInt();
        int soma = 0;
        int cont = 0;
        double media;

        while (idade >= 0) {
            soma += idade;
            cont += 1;
            idade = scanner.nextInt();
        }
        if (cont > 0) {
            media = (double) soma / cont;
            System.out.printf("%.2f%n", media);
        }
        else {
            System.out.println("Impossível Calcular");
        }
        scanner.close();
    }
    
}
