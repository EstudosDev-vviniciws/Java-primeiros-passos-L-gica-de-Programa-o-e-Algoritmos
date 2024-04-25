package Estrutura_Repetitiva;
import java.util.Scanner;

public class EstruturaRepetitiva02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();
        int x = scanner.nextInt();

        while (x != y) {
            if (x < y) {
                System.out.println("Crescente");
            }
            else {
                System.out.println("Decrescente");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
                                  
        scanner.close();
    }
}
