package Estrutura_Repetitiva;
import java.util.Scanner;

public class EstruturaRepetitiva06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x, y;
        
        System.out.println("Digite o valor de X: ");
        x = scanner.nextInt();
        System.out.println("Digite o valor de Y: ");
        y = scanner.nextInt();

        int min, max;
        if (x < y) {
            min = x;
            max = y;
        }
        else {
            min = y;
            max = x;
        }
        int soma = 0;
        for (int i = min + 1; i < max; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        System.out.println("A soma dos números ímpares entre os valores fornecidos é: " + soma);
        scanner.close();
    }
    
}
